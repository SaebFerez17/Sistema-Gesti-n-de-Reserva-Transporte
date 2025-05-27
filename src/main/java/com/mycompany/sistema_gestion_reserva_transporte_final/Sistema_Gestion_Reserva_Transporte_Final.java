/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_gestion_reserva_transporte_final;

import Controlador.ControladorUsuario;
import Vista.VistaUsuario;

/**
 *
 * @author sebas
 */
public class Sistema_Gestion_Reserva_Transporte_Final {

    public static void main(String[] args) {
        ControladorUsuario controlador = new ControladorUsuario(new VistaUsuario());
        controlador.Ejecutar();
    }
    
}
