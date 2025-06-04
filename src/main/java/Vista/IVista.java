
package Vista;

import java.util.ArrayList;

public interface IVista {
    int menu();
    String[] ingresarDatos();
    String[] actualizarDatos(String dat);
    void graficarLista(ArrayList<Object> lista);
    boolean borrarDatos(String dat);
    String getString(String msj);
    int getInt(String msj);
    long getLong(String msj);
    String[] stringToList(String texto);
    void mostrarMensaje(String msg);
}
