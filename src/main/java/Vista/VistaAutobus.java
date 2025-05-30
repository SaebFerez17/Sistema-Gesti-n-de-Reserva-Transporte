
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean BorrarDatos(String dat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void GraficarLista(ArrayList<Object> lista) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
