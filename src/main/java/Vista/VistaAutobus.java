
package Vista;

import Utilidades.Util;
import static Utilidades.Util.getInt;


public class VistaAutobus {    
    public int Menu(){
        String[] opciones = {"1) Agregar", "2) Borrar", "3) Actualizar", "4)Listar"};
        return Util.menu(opciones);
    }
    
    public String[]  Datos (){
        String[] datos = new String[2];
        datos[0] = String.valueOf(Utilidades.Util.getString("Digite la Placa del Autobus: "));
        datos[1] = String.valueOf(getInt("Digite la Capacidad max del Autobus: "));
        datos[2] = String.valueOf(Utilidades.Util.getInt("Digite los Servicios Adicionales: "));
        return datos;
    }

}
