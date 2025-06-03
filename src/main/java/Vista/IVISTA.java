
package Vista;

import java.util.ArrayList;

public interface IVISTA {
    int menu();
    String[] IngresarDatos();
    String[] ActualizarDatos(String dat);
    void GraficarLista(ArrayList<Object> lista);
    boolean BorrarDatos(String dat);
    String getString(String msj);
    int getInt(String msj);
    long getLong(String msj);
    String[] StringToList(String texto);
    void MostrarMensaje(String msg);
}
