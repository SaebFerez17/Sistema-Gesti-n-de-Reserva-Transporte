
package Modelo;
import Utilidades.Fecha;


public class Itinerario {
    private int id;
    private Fecha fecha;
    private String[] ruta = new String[2];
    private Conductor conductor;
    private double precio;
    private Vehiculo vehiculo;

    public Itinerario() {
    }

    public Itinerario(int id,Fecha fecha, String[] ruta, Conductor conductor, Vehiculo vehiculo, double precio) {
        this.id = id;
        this.fecha = fecha;
        this.ruta = ruta;
        this.conductor = conductor;
        this.precio = precio;
        this.vehiculo = vehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    public String getFecha() {
        return fecha.fechaString();
    }

    public void setFecha(String fecha) {
        this.fecha.setFecha(fecha);
    }
    
    public String getHora() {
        return fecha.horaString();
    }

    public void setHora(String hora) {
        this.fecha.setHora(hora);
    }

    public String[] getRuta() {
        return ruta;
    }

    public void setRuta(String[] Ruta) {
        this.ruta = Ruta;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Itinerario{" + "id=" + id + ", fecha=" + fecha.toString() + ", ruta=" + String.join(",", ruta) + ", conductor=" + conductor + ", precio=" + precio + ", vehiculo=" + vehiculo + '}';
    }
    
    
}
