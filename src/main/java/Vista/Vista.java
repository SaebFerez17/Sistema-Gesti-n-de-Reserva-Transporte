
package Vista;

import Utilidades.Util;
import java.util.ArrayList;


public abstract class Vista implements IVista{
    private String tipo;

    public Vista(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public  abstract int menu();

    @Override
    public abstract String[] ingresarDatos();

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
    public String[] stringToList(String texto){
        return Util.stringToList(texto);
    }

    @Override
    public String[] actualizarDatos(String dat) {
        String[] datos = stringToList(dat);
        if (Util.getInt("Desea modificar: " + dat + "?" + "\n 1) SI \notro) No") != 1) return datos;
        System.out.println("Porfavor, volver a ingresar los datos del " + tipo + ": ");
        return  ingresarDatos();
    }

    @Override
    public boolean borrarDatos(String dat) {
        return Util.getInt("Desea borrar al " + tipo + ": " + dat + "? \n1) Si \notro) No") == 1;
    }

    @Override
    public void graficarLista(ArrayList<Object> lista) {
        System.out.println(tipo + " registrados: ");
        for (Object item : lista) {
            System.out.println(item.toString());
        }
    }
    
    @Override
    public void mostrarMensaje(String msg){
        System.out.println(msg);
    }
}
