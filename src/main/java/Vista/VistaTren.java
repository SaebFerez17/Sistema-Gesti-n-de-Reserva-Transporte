
package Vista;

import Utilidades.Util;
import java.util.ArrayList;

//String id, int capacidad_maxima, Itinerario itinerario, int numPrimeraClase
public class VistaTren implements IVISTA{
    
    @Override
    public int menu(){
        String[] opciones = {"1) Agregar", "2) Boorrar", "3) Actualizar", "4)Listar"};
        return Util.menu(opciones);
    }
    
    @Override
    public String[] IngresarDatos(){
        String[] datos = new String[4];
        datos[0] = String.valueOf(Utilidades.Util.getString("Digite el identificador del tren: "));
        datos[1] = String.valueOf(Utilidades.Util.getInt("Digite la capacidad maxima: "));
        datos[2] = String.valueOf(Utilidades.Util.getInt("Digite la cantidad de asientos de primera clase: "));
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
        System.out.println("Porfavor, volver a ingresar los datos del tren: ");
        return  IngresarDatos();
    }

    @Override
    public boolean BorrarDatos(String dat) {
        return Util.getInt("Desea borrar al tren: " + dat + "? \n1) Si \notro) No") == 1;
    }

    @Override
    public void GraficarLista(ArrayList<Object> lista) {
        System.out.println("Tremes registrados: ");
        for (Object item : lista) {
            System.out.println(item.toString());
        }
    }

}
