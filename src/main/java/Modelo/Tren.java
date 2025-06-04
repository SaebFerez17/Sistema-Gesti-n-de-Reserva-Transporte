
package Modelo;

public class Tren extends Vehiculo{
    private int numPrimeraClase;
    private boolean[] puestos;

    public Tren(String id, int capacidad_maxima, int numPrimeraClase) {
        super("Tren", id, capacidad_maxima);
        this.numPrimeraClase = numPrimeraClase;
        puestos = new boolean[capacidad_maxima];
        for (int i = 0; i < capacidad_maxima; i++) {
            puestos[i] = false;
        }
    }

    public int getNumPrimeraClase() {
        return numPrimeraClase;
    }

    public void setNumPrimeraClase(int numPrimeraClase) {
        this.numPrimeraClase = numPrimeraClase;
    }
    
    @Override
    public int asignarPuesto(int tipo){
        for (int i = 0; i < this.getCapacidad_maxima(); i++) {
            if (tipo == 0){
                if (puestos[i] == false && i < this.numPrimeraClase) {
                    puestos[i] = true;
                    return i;
                }
            }else{
                if (puestos[i] == false && i >= this.numPrimeraClase) {
                    puestos[i] = true;
                    return i;
                }
            }      
        }
        return -1;
    }
    
    @Override
    public void librearPuesto(int puesto){
        this.puestos[puesto] = false;
    }

    public boolean[] getPuestos() {
        return puestos;
    }

    public void setPuestos(boolean[] puestos) {
        this.puestos = puestos;
    }

    @Override
    public String toString() {
        return getId() + ", " + getCapacidad_maxima() + ", " + getNumPrimeraClase();
    }
    
    
    
    
    
}
