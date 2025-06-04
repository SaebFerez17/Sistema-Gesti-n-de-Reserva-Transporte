
package Controlador;

import Modelo.Reserva;
import Vista.VistaReserva;
import java.util.ArrayList;
import Controlador.ControladorUsuario;
import Utilidades.Util;


public class ControladorReserva implements IMetodosCRUD<Reserva, Integer>{
    private ArrayList<Reserva> lista = new ArrayList<>();
    private VistaReserva vista;
    private ControladorUsuario usuario;
    private ControladorItinerario itinerario;
    private int generadorId;

    public ControladorReserva(VistaReserva vista, ControladorUsuario usuario, ControladorItinerario itinerario) {
        generadorId = 1;
        this.vista = vista;
        this.usuario = usuario;
        this.itinerario = itinerario;
    }

    @Override
    public void ejecutar() {
        int op;
        do {
            op = vista.menu();
            casos(op);
        } while (op != -1);
    }

    @Override
    public void casos(int op) {
        switch (op) {
            case 1:
                itinerario.GraficarLista();
                Reserva res = crear(vista.ingresarDatos());
                if (res != null) {
                    add(res);
                }else{
                    vista.mostrarMensaje("Reserva no agregada");
                }
                
                break;
            case 2:
                delete(buscar(vista.getInt("Ingrese el id de la reserva")));
                break;
            case 3:
                vista.mostrarMensaje("Ingrese los nuevos datos de la reserva");
                Reserva reserva = crear(vista.ingresarDatos());
                update(buscar(reserva.getId()),reserva);
                break;
            case 4:
                vista.graficarLista(new ArrayList<>(lista));
                break;
            case -1:
                break;
            default:
                vista.mostrarMensaje("Opción inválida");
        }
    }
    
    @Override
    public Reserva crear(String[] datos){
        Modelo.Itinerario iti = itinerario.encontrar(Integer.valueOf(datos[1]));
        
        Modelo.Vehiculo vehiculo = iti.getVehiculo();
        int puesto = vehiculo.asignarPuesto(Integer.parseInt(datos[2]));
        if (puesto == -1 || usuario.encontrar(Long.valueOf(datos[0])) == null){
            vista.mostrarMensaje("No hay sitios disp");
            return null;
        }
        Reserva reserva = new Reserva(
        generadorId++,
        usuario.encontrar(Long.valueOf(datos[0])),
        iti,
        puesto
        );
        return reserva;
    }
    
    @Override
    public void add(Reserva reserva) {
        lista.add(reserva);
    }

    @Override
    public void delete(int indice) {
        lista.get(indice).getItinerario().getVehiculo().librearPuesto(lista.get(indice).getNumeroPuesto());
        lista.remove((int)indice);
    }

    @Override
    public void update(int indice, Reserva reserva) {
        lista.set((int)indice, reserva);
    }

    @Override
    public ArrayList<Reserva> toList() {
        return lista;
    }

    @Override
    public int buscar(Integer id) {
        int pos=0;
        for (Reserva reserva : lista) {
            if (reserva.getId()==id) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
    
    @Override
    public Reserva encontrar(Integer id) {
        for (Reserva reserva : lista) {
            if (reserva.getId()==id) return reserva;
        }
        return null;
    }
}
