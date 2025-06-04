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
public class VistaItinerario extends Vista{
    
    public VistaItinerario() {
        super("Itinerario");
    }
    
    @Override
    public int menu() {
        String[] opciones = {" Menu Itinerario", "Agregar", "Borrar", "Actualizar", "Listar"};
        return Util.menu(opciones);    }

    @Override
    public String[] ingresarDatos() {
        String[] datos = new String[4];
        datos[0] = String.valueOf(Utilidades.Util.getString("Digite la hora, del modo [hora:minuto]: "));
        datos[1] = String.valueOf(Util.getString("Digite la fecha, del modo [dia/mes/año]: "));
        datos[2] = String.valueOf(Utilidades.Util.getString("Digite la ruta, del modo [origen,destino]: "));
        datos[3] = String.valueOf(Utilidades.Util.getLong("Digite la el precio del viaje: "));
        return datos;
    }
    
}
