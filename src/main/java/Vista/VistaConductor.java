/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Utilidades.Util;
import java.util.ArrayList;

/**
 *
 * @author spico
 */
public class VistaConductor implements IVISTA{
     public String[] IngresarDatos(){
        String[] datos = new String[4];
        datos[0] = String.valueOf(Utilidades.Util.getString("Digite el nombre del conductor: "));
        datos[1] = String.valueOf(Utilidades.Util.getInt("Digite la cedula del conductor: "));
        datos[2] = String.valueOf(Utilidades.Util.getInt("Digite el salario del conductor: "));
        datos[3] = String.valueOf(Utilidades.Util.getString("Igresa los dias a Trabajar separador por ( , ): "));
        return datos;
    }
    
    @Override
    public int menu(){
        String[] opciones = {" Menu Conductor ","Agregar", "Boorrar", "Actualizar", "Listar"};
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
        System.out.println("Porfavor, volver a ingresar los datos del conductor: ");
        return  IngresarDatos();
    }

    @Override
    public boolean BorrarDatos(String dat) {
        return Util.getInt("Desea borrar al conductor: " + dat + "? \n1) Si \notro) No") == 1;
    }

    @Override
    public void GraficarLista(ArrayList<Object> lista) {
        System.out.println("Conductores registrados: ");
        for (Object item : lista) {
            System.out.println(item.toString());
        }
    }
}
