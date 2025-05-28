
package Utilidades;
import Utilidades.Util;

public class Menu {

    private String[] opciones;
    

    
    public Menu(String[] opciones) {
        this.opciones = opciones;
    }
    
    public int Crear(){
        for (String opcione : opciones) {
            System.out.println(opcione);
        }
        System.out.println("-1) Salir");
        return Util.getInt("Seleccione una opcion: ");
    }
    
}
