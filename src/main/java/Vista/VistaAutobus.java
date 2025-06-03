
package Vista;

import Utilidades.Util;
import java.util.ArrayList;


public class VistaAutobus extends Vista{    
    
    public VistaAutobus() {
        super("Autobús");
    }
    
    @Override
    public int menu() {
        String[] opciones = {" Menu Autobuses", "Agregar", "Borrar", "Actualizar"};
        return Util.menu(opciones);    }

    @Override
    public String[] IngresarDatos() {
        String[] datos = new String[3];
        datos[0] = String.valueOf(Utilidades.Util.getString("Digite la Placa del Autobus: "));
        datos[1] = String.valueOf(Util.getInt("Digite la Capacidad max del Autobus: "));
        datos[2] = String.valueOf(Utilidades.Util.getString("Digite los Servicios Adicionales, de la manera [s1,s2,s3]: "));
        return datos;
    }

}
