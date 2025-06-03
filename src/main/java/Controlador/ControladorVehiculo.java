
package Controlador;

import Modelo.Vehiculo;
import java.util.ArrayList;


public abstract class ControladorVehiculo implements IMETODOSCRUD<Vehiculo, String>{
    
    private ArrayList<Vehiculo> lista = new ArrayList<>();
    
    @Override
    public abstract void ejecutar();
    
    @Override
    public abstract void Casos(int op);
    
    @Override
    public abstract Vehiculo Crear(String[] datos);
    
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
        return null;
    }

    public ArrayList<Vehiculo> getLista() {
        return lista;
    }
    
    
}
