
package Modelo;

public class Autobuses extends Vehiculo{
    
    private String [] serviciosAdicionales;

    public Autobuses(String id, int capacidad_maxima, Itinerario itinerario) {
        super(id, capacidad_maxima, itinerario);
    }

    public Autobuses(String[] serviciosAdicionales, String id, int capacidad_maxima, Itinerario itinerario) {
        super(id, capacidad_maxima, itinerario);
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public String[] getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(String[] serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }
    
    


}
