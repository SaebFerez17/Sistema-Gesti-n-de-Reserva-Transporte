
package Controlador;

import Modelo.Itinerario;
import Vista.VistaItinerario;
import java.util.ArrayList;
import Utilidades.Fecha;


public class ControladorItinerario implements IMETODOSCRUD<Itinerario, Integer>{
    private VistaItinerario vista;
    private ControladorConductor conductor;
    private ControladorVehiculo vehiculo;
    private ArrayList<Itinerario> lista = new ArrayList<>();
    private int id;

    public ControladorItinerario(VistaItinerario vista, ControladorConductor conductor, ControladorVehiculo vehiculo) {
        this.vista = vista;
        this.vehiculo = vehiculo;
        this.conductor = conductor;
        id = 1;
    }
    
    @Override
    public void ejecutar(){
        int op = 0;
        do {  
            op=vista.menu();
            Casos(op);
            
        } while (op!=-1);
    }
    
    @Override
    public void Casos(int op){
        switch (op) {
            case 1:
                
                Itinerario iti = Crear(vista.IngresarDatos());
                if (iti != null){
                    add(iti);
                }else{
                    vista.MostrarMensaje("Itinerario no agregado");
                }
                break;
            case 2:
                int indice=buscar(vista.getInt("Ingrese el Id del itinerario: "));
                delete(indice);
                break;
            case 3:
                Itinerario itinerario= Crear(vista.IngresarDatos());
                update(buscar(itinerario.getId()), itinerario);
                break;
            case 4:
                vista.GraficarLista(new ArrayList<>(lista));
                break;
            case -1:
                break;
            default:
                throw new AssertionError();
        }
    }
    
    @Override
    public Itinerario Crear(String[] datos){
        vehiculo.GraficarLista();
        Modelo.Vehiculo transporte = vehiculo.encontrar(vista.getString("Ingrese la identificacion del vehiculo:  "));
        conductor.graficarlista();
        Modelo.Conductor chofer =conductor.encontrar(vista.getLong("Ingrese la identificacion del conductor:  "));
        
        if (transporte == null || chofer == null) {
            vista.MostrarMensaje("ERROR: [El conductor o el vehiculo asignado no existen]");
            return null;
        }

        Itinerario itinerario = new Itinerario(
        id++,
        new Fecha(datos[1], datos[0]),
        vista.StringToList(datos[2]),
        chofer,
        transporte,
        Double.parseDouble(datos[3])        
        );
        transporte.setItinerario(itinerario);
        return itinerario;
    }
    
    @Override
    public void add(Itinerario itinerario) {
        lista.add(itinerario);
    }

    @Override
    public void delete(int indice) {
        lista.remove((int)indice);
    }

    @Override
    public void update(int indice, Itinerario itinerario) {
        lista.set((int)indice, itinerario);
    }

    @Override
    public ArrayList<Itinerario> toList() {
        return lista;
    }

    @Override
    public int buscar(Integer id) {
        int pos=0;
        for (Itinerario itinerario : lista) {
            if (itinerario.getId() == id) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
    
    @Override
    public Itinerario encontrar(Integer id) {
        for (Itinerario itinerario : lista) {
            if (itinerario.getId() == id) return itinerario;
        }
        return null;
    }
    
    public void GraficarLista() {
        vista.GraficarLista(new ArrayList<>(lista));
    }

}
