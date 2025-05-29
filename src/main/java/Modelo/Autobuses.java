
package Modelo;

public class Autobuses extends Vehiculo{
    
    private String[] serviciosAdicionales;

    public Autobuses() {
    }

    public Autobuses(String[] serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public Autobuses(String[] serviciosAdicionales, String id, int capacidad_maxima) {
        super(id, capacidad_maxima);
        this.serviciosAdicionales = serviciosAdicionales;
    }
    
    
    
    
}
