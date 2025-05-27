/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sebas
 */
public class Usuario extends Persona{
    
    public Usuario(String nombre, long cedula) {
        super(nombre, cedula);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + ", Cedula: " + this.getCedula();
    }
    
    
}
