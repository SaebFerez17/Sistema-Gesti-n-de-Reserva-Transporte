
package Modelo;

import java.util.ArrayList;

public class Autobuses extends Vehiculo{
    private ArrayList<String> serviciosAdicionales;

    public Autobuses(String id, int capacidad_maxima,String[] serviciosAdicionales) {
        super(id, capacidad_maxima);
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

    

}
