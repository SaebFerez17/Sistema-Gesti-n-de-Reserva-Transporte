
package Controlador;

import Modelo.Conductor;
import Modelo.Vehiculo;
import Vista.VistaAutobus;
import java.util.ArrayList;


public class ControladorVehiculo implements IMetodosCRUD<Vehiculo, String>{
    
    private static ArrayList<Vehiculo> lista = new ArrayList<>();
    
    @Override
    public void ejecutar(){
        
    }
    
    @Override
    public void casos(int op){
        
    }
    
    @Override
    public void add(Vehiculo vehiculo) {
        this.lista.add(vehiculo);
    }

    @Override
    public void delete(int indice) {
        lista.remove((int)indice);
    }

    @Override
    public void update(int indice, Vehiculo vehiculo) {
        lista.set((int)indice, vehiculo);
    }

    @Override
    public ArrayList<Vehiculo> toList() {
        return lista;
    }

    @Override
    public int buscar(String id) {
        int pos=0;
        for (Vehiculo vehiculo : lista) {
            if (vehiculo.getId().equals(id)) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
    
    @Override
    public Vehiculo encontrar(String id) {
        for (Vehiculo vehiculo : lista) {
            if (vehiculo.getId().equals(id)) return vehiculo;
        }
        System.out.println("f");
        return null;
    }

    

    @Override
    public Vehiculo crear(String[] datos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void GraficarLista(){
        Vista.VistaAutobus vistatemp = new VistaAutobus();
        vistatemp.graficarLista(new ArrayList<>(this.lista));
    }
}
