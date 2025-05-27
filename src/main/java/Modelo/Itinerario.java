/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sebas
 */
public class Itinerario {
    private String hora;
    private int[] Fecha = new int[3];
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

    public int[] getFecha() {
        return Fecha;
    }

    public void setFecha(int[] Fecha) {
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
