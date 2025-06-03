
package Controlador;

import Modelo.Itinerario;
import Vista.VistaItinerario;
import java.util.ArrayList;

public class ControladorItinerario implements IMETODOSCRUD<Itinerario, Integer>{
    private VistaItinerario vista;
    private ArrayList<Itinerario> lista = new ArrayList<>();

    public ControladorItinerario(VistaItinerario vista) {
        this.vista = vista;
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
                add(Crear(vista.IngresarDatos()));
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

            default:
                throw new AssertionError();
        }
    }
    
    @Override
    public Itinerario Crear(String[] datos){
        Itinerario itinerario = new Itinerario();
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

}
