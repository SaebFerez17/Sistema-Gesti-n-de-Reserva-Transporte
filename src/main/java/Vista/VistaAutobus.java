
package Vista;

import Utilidades.Util;
import java.util.ArrayList;


public class VistaAutobus implements IVISTA{    

    @Override
    public int menu() {
        String[] opciones = {"1) Agregar", "2) Borrar", "3) Actualizar", "4)Listar"};
        return Util.menu(opciones);    }

    @Override
    public String[] IngresarDatos() {
        String[] datos = new String[2];
        datos[0] = String.valueOf(Utilidades.Util.getString("Digite la Placa del Autobus: "));
        datos[1] = String.valueOf(Util.getInt("Digite la Capacidad max del Autobus: "));
        datos[2] = String.valueOf(Utilidades.Util.getInt("Digite los Servicios Adicionales: "));
        return datos;
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
        System.out.println("Porfavor, volver a ingresar los datos del autobus: ");
        return  IngresarDatos();
    }

    @Override
    public boolean BorrarDatos(String dat) {
        return Util.getInt("Desea borrar al autobus: " + dat + "? \n1) Si \notro) No") == 1;
    }

    @Override
    public void GraficarLista(ArrayList<Object> lista) {
        System.out.println("Autobuses registrados: ");
        for (Object item : lista) {
            System.out.println(item.toString());
        }
    }

}
