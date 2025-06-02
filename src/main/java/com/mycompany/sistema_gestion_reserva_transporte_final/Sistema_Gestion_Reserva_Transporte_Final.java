/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_gestion_reserva_transporte_final;

import Controlador.ControladorConductor;
import Modelo.Conductor;
import Vista.VistaConductor;
import Vista.VistaUsuario;

/**
 *
 * @author sebas
 */
public class Sistema_Gestion_Reserva_Transporte_Final {

    public static void main(String[] args) {
        Modelo.Conductor conductor = new Conductor("Manolo",123,2,new String[] {"LUNES","VIERNES","DOMINGO"});
        System.out.println(conductor.toString());;
        ControladorConductor controlador = new ControladorConductor(new VistaConductor());
        controlador.ejecutar();
        
        
    }
    
}
