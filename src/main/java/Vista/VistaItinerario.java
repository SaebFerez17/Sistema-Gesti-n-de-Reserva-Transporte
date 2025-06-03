/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Utilidades.Util;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class VistaItinerario implements IVISTA{

    @Override
    public int menu() {
        String[] opciones = {" Menu Itinerario", "Agregar", "Borrar", "Actualizar", "Listar"};
        return Util.menu(opciones);    }

    @Override
    public String[] IngresarDatos() {
        String[] datos = new String[2];
        datos[0] = String.valueOf(Utilidades.Util.getString("Digite la hora, del modo [hora,minuto]: "));
        datos[1] = String.valueOf(Util.getInt("Digite la fecha, del modo [dia/mes/año]: "));
        datos[2] = String.valueOf(Utilidades.Util.getInt("Digite la ruta, del modo [origen/destino]: "));
        datos[3] = String.valueOf(Utilidades.Util.getInt("Digite la cedula del condutor asociado: "));
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
        System.out.println("Porfavor, volver a ingresar los datos del itinerario: ");
        return  IngresarDatos();
    }

    @Override
    public boolean BorrarDatos(String dat) {
        return Util.getInt("Desea borrar al itinerario: " + dat + "? \n1) Si \notro) No") == 1;
    }

    @Override
    public void GraficarLista(ArrayList<Object> lista) {
        System.out.println("Itinerarios registrados: ");
        for (Object item : lista) {
            System.out.println(item.toString());
        }
    }
    
}
