
package Modelo;


public class Reserva {
    private int id;
    private Usuario pasajero;
    private Itinerario itinerario;
    private int numeroPuesto;

    public Reserva(int id, Usuario pasajero, Itinerario itinerario, int numeroPuesto) {
        this.id = id;
        this.pasajero = pasajero;
        this.itinerario = itinerario;
        this.numeroPuesto = numeroPuesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Usuario getPasajero() {
        return pasajero;
    }

    public void setPasajero(Usuario pasajero) {
        this.pasajero = pasajero;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    public int getNumeroPuesto() {
        return numeroPuesto;
    }

    public void setNumeroPuesto(int numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }
}
