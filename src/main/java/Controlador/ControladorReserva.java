
package Controlador;

import Modelo.Reserva;
import Vista.VistaReserva;
import java.util.ArrayList;
import Controlador.ControladorUsuario;
import Utilidades.Util;


public class ControladorReserva implements IMETODOSCRUD<Reserva, Integer>{
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
            Casos(op);
        } while (op != -1);
    }

    @Override
    public void Casos(int op) {
        switch (op) {
            case 1:
                add(Crear(vista.IngresarDatos()));
                break;
            case 2:
                delete(buscar(vista.getInt("Ingrese el id de la reserva")));
                break;
            case 3:
                vista.MostrarMensaje("Ingrese los nuevos datos de la reserva");
                Reserva reserva = Crear(vista.IngresarDatos());
                update(buscar(reserva.getId()),reserva);
                break;
            case 4:
                toList();
                break;
            default:
                vista.MostrarMensaje("Opción inválida");
        }
    }
    
    @Override
    public Reserva Crear(String[] datos){
        Modelo.Itinerario iti = itinerario.encontrar(Integer.valueOf(datos[1]));
        Modelo.Vehiculo vehiculo = iti.getVehiculo();
        int puesto = vehiculo.AsignarPuesto(Integer.parseInt(datos[2]));
        if (puesto == -1){
            vista.MostrarMensaje("No hay sitios disp");
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
        lista.get(indice).getItinerario().getVehiculo().LibrearPuesto(lista.get(indice).getNumeroPuesto());
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
