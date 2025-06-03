
package Vista;

import Utilidades.Util;
import java.util.ArrayList;


public abstract class Vista implements IVISTA{
    private String tipo;

    public Vista(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public  abstract int menu();

    @Override
    public abstract String[] IngresarDatos();

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
        System.out.println("Porfavor, volver a ingresar los datos del " + tipo + ": ");
        return  IngresarDatos();
    }

    @Override
    public boolean BorrarDatos(String dat) {
        return Util.getInt("Desea borrar al " + tipo + ": " + dat + "? \n1) Si \notro) No") == 1;
    }

    @Override
    public void GraficarLista(ArrayList<Object> lista) {
        System.out.println(tipo +" registrados: ");
        for (Object item : lista) {
            System.out.println(item.toString());
        }
    }
}
