
package Modelo;

import java.util.ArrayList;

public class Autobuses extends Vehiculo{
    private ArrayList<String> serviciosAdicionales;
    private boolean[] puestos;

    public Autobuses(String id, int capacidad_maxima,String[] serviciosAdicionales) {
        super("Autobus",id, capacidad_maxima);
        this.puestos = new boolean[capacidad_maxima];
        this.serviciosAdicionales = new ArrayList<>();
        for (String servicio : serviciosAdicionales) {
            this.serviciosAdicionales.add(servicio);
        }
    }

    public ArrayList<String> getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(ArrayList<String> serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }
    
    public void setServiciosAdicionales(String servicio) {
        this.serviciosAdicionales.add(servicio);
    }

    @Override
    public String toString() {
        return getId() + ", " + getCapacidad_maxima();
    }

    @Override
    public int AsignarPuesto(int tipo){
        for (int i = 0; i < this.getCapacidad_maxima(); i++) {
            if (puestos[i] == false) {
                    puestos[i] = true;
                    return i;
                }   
        }
        return -1;
    }
    
    @Override
    public void LibrearPuesto(int puesto){
        this.puestos[puesto] = false;
    }

    

}
