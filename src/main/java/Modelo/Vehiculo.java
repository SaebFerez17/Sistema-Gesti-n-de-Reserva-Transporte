
package Modelo;


public abstract class Vehiculo {
    private String id;
    private int capacidad_maxima;
    private Itinerario itinerario;

    public Vehiculo(String id, int capacidad_maxima, Itinerario itinerario) {
        this.id = id;
        this.capacidad_maxima = capacidad_maxima;
        this.itinerario = itinerario;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(int capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
    
    
    
}
