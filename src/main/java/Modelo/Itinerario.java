
package Modelo;


public class Itinerario {
    private String hora;
    private String Fecha;
    private String[] Ruta = new String[2];
    private Conductor conductor;
    private double precio;

    public Itinerario() {
    }

    public Itinerario(String hora, Conductor conductor, double precio) {
        this.hora = hora;
        this.conductor = conductor;
        this.precio = precio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String[] getRuta() {
        return Ruta;
    }

    public void setRuta(String[] Ruta) {
        this.Ruta = Ruta;
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
    
    
}
