package Vista;

import  Utilidades.Util;
import  Utilidades.Menu;
import java.util.ArrayList;

public class VistaUsuario implements IVISTA{
    
    
    @Override
    public String[] IngresarDatos(){
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
    
    @Override
    public String getString(String msj){
        return Util.getString(msj);
    }
    @Override
    public int getInt(String msj){
        return Util.getInt(msj);
    }
    @Override
    public long getLong(String msj){
        return Util.getLong(msj);
    }
    @Override
    public String[] StringToList(String texto){
        return Util.StringToList(texto);
    }

    @Override
    public String[] ActualizarDatos(String dat) {
        String[] datos = StringToList(dat);
        if (Util.getInt("Desea modificar: " + dat + "?" + "\n 1) SI \notro) No") != 1) return datos;
        System.out.println("Porfavor, volver a ingresar los datos del usuario: ");
        return  IngresarDatos();
    }

    @Override
    public boolean BorrarDatos(String dat) {
        return Util.getInt("Desea borrar al usuario: " + dat + "? \n1) Si \notro) No") == 1;
    }

    @Override
    public void GraficarLista(ArrayList<Object> lista) {
        System.out.println("Usuarios registrados: ");
        for (Object item : lista) {
            System.out.println(item.toString());
        }
    }
}
