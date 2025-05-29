
package Modelo;

public class Autobuses extends Vehiculo{
    private String [] serviciosAdicionales;

    public Autobuses(String id, int capacidad_maxima) {
        super(id, capacidad_maxima);
    }

    public Autobuses(String id, int capacidad_maxima, String[] serviciosAdicionales) {
        super(id, capacidad_maxima);
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public String[] getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(String[] serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }

    @Override
    public String toString() {
        return "Autobuses{" + "serviciosAdicionales=" + serviciosAdicionales + '}';
    }

}
