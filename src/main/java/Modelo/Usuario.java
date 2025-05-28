
package Modelo;


public class Usuario extends Persona{
    
    public Usuario(String nombre, long cedula) {
        super(nombre, cedula);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + ", Cedula: " + this.getCedula();
    }
    
    
}
