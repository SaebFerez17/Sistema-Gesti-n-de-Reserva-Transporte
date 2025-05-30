
package Modelo;


public class Itinerario {
    private String hora;
    private int[] fecha = new int[3];
    private String[] Ruta = new String[2];
    private Conductor conductor;
    private double precio;

    public Itinerario() {
    }

    public Itinerario(String hora, String fecha, Conductor conductor, double precio) {
        this.hora = hora;
        setFecha(fecha);
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
        return fecha[0] + "/" + fecha[1] + "/" + fecha[2];
    }

    public void setFecha(String fecha) {
        if (fecha.split("/").length != 3) {
        throw new IllegalArgumentException("Formato de fecha inválido. Debe ser dd/mm/aaaa");
        }
        for (int i = 0; i < fecha.length(); i++) {
            this.fecha[i] = Integer.valueOf(fecha.split("/")[i]);
        }      
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
