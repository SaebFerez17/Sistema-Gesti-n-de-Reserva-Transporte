
package Modelo;


public abstract class Vehiculo {
    private String tipo;
    private String id;
    private int capacidad_maxima;
    private Itinerario itinerario;

    public Vehiculo(String tipo, String id, int capacidad_maxima) {
        this.tipo = tipo;
        this.id = id;
        this.capacidad_maxima = capacidad_maxima;
    }
    
    public abstract int asignarPuesto(int tipo);

    public abstract void librearPuesto(int puesto);
            
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
