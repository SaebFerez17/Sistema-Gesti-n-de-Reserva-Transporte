
package Vista;

import Utilidades.Util;
import java.util.ArrayList;


public class VistaAutobus extends Vista{    
    
    public VistaAutobus() {
        super("Autobús");
    }
    
    @Override
    public int menu() {
        String[] opciones = {" Menu Autobuses", "Agregar", "Borrar", "Actualizar", "Listar"};
        return Util.menu(opciones);    }

    @Override
    public String[] IngresarDatos() {
        String[] datos = new String[2];
        datos[0] = String.valueOf(Utilidades.Util.getString("Digite la Placa del Autobus: "));
        datos[1] = String.valueOf(Util.getInt("Digite la Capacidad max del Autobus: "));
        datos[2] = String.valueOf(Utilidades.Util.getInt("Digite los Servicios Adicionales: "));
        return datos;
    }

}
