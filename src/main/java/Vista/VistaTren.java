
package Vista;

import Utilidades.Util;


public class VistaTren {
    public String[] IngresarConductor(){
        String[] datos = new String[2];
        datos[0] = String.valueOf(Utilidades.Util.getString("Digite el nombre del conductor: "));
        datos[1] = String.valueOf(Utilidades.Util.getInt("Digite la cedula del conductor: "));
        return datos;
    }
    
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

}
