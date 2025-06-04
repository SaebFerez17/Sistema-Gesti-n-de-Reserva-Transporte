package Vista;

import  Utilidades.Util;
import  Utilidades.Menu;
import java.util.ArrayList;

public class VistaUsuario extends Vista{
    
    public VistaUsuario() {
        super("Usuario");
    }
    
    @Override
    public String[] ingresarDatos(){
        String[] datos = new String[2];
        datos[0] = String.valueOf(Utilidades.Util.getString("Digite el nombre del usuario: "));
        datos[1] = String.valueOf(Utilidades.Util.getInt("Digite la cedula del usuario: "));
        return datos;
    }
    
    @Override
    public int menu(){
        String[] opciones = {" Menu Usuario ","Agregar", "Boorrar", "Actualizar", "Listar"};
        return Util.menu(opciones);
    }
    
}
