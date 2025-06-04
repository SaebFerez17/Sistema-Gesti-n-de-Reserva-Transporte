/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Conductor;
import Utilidades.Util;
import java.util.ArrayList;

/**
 *
 * @author spico
 */
public class VistaConductor extends Vista{
    
    public VistaConductor() {
        super("Conductor");
    }
    
    @Override
     public String[] ingresarDatos(){
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

    
    

}
