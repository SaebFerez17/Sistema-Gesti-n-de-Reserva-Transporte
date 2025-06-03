
package Utilidades;
import Utilidades.Util;

public class Menu {
    private String bandera = ".";
    private  int largo = 50;
    private String[] opciones;
    

    
    public Menu(String[] opciones) {
        this.opciones = opciones;
    }

    
    public int Crear(){
        if (opciones.length==0) {
            System.out.println("No hay opciones...");
            return -1;
        }
        int q = (largo - opciones[0].length())/2;
        System.out.println(bandera.repeat(q) + opciones[0] + bandera.repeat(q));
        
        for (int i = 1; i < opciones.length; i++) {
            
            q = largo - (opciones[i].length() + 1);
            System.out.println(opciones[i] + bandera.repeat(q) + i);
        }
        System.out.println("Salir" + bandera.repeat(43)+-1);
        return Util.getInt("Seleccione una opcion: ");
    }

}
