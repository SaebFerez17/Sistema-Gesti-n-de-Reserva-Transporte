
package Vista;

import Utilidades.Util;


public class VistaAutobus {    
    public int Menu(){
        String[] opciones = {"1) Agregar", "2) Boorrar", "3) Actualizar", "4)Listar"};
        return Util.menu(opciones);
    }
    
    public String getString(String msj){
        return Util.getString(msj);
    }
    public int getInt(String msj){
        return Util.getInt(msj);
    }
    public long getLong(String msj){
        return Util.getLong(msj);
    }
    public String[] getLista(String msj){
        return Util.getLista(msj);
    }

}
