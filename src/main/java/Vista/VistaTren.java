
package Vista;

import Utilidades.Util;
import java.util.ArrayList;

//String id, int capacidad_maxima, Itinerario itinerario, int numPrimeraClase
public class VistaTren extends Vista{
    
    public VistaTren() {
        super("Tren");
    }
    
    @Override
    public int menu(){
        String[] opciones = {" Menu Tren ","Agregar", "Boorrar", "Actualizar", "Listar"};
        return Util.menu(opciones);
    }
    
    @Override
    public String[] IngresarDatos(){
        String[] datos = new String[4];
        datos[0] = String.valueOf(Utilidades.Util.getString("Digite el identificador del tren: "));
        datos[1] = String.valueOf(Utilidades.Util.getInt("Digite la capacidad maxima: "));
        datos[2] = String.valueOf(Utilidades.Util.getInt("Digite la cantidad de asientos de primera clase: "));
        return datos;
    }
    
    
    

}
