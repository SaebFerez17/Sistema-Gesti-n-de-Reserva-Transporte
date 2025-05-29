
package Modelo;

public class Tren extends Vehiculo{
    private int numPrimeraClase;

    public Tren(int numPrimeraClase, String id, int capacidad_maxima, Itinerario itinerario) {
        super(id, capacidad_maxima, itinerario);
        this.numPrimeraClase = numPrimeraClase;
    }

    public int getNumPrimeraClase() {
        return numPrimeraClase;
    }

    public void setNumPrimeraClase(int numPrimeraClase) {
        this.numPrimeraClase = numPrimeraClase;
    }
    
    

        
    
    
    
    
}
