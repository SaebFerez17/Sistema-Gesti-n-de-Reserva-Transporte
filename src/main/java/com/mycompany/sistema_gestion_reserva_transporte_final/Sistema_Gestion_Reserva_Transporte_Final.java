

package com.mycompany.sistema_gestion_reserva_transporte_final;

import Controlador.*;
import Utilidades.Menu;
import Vista.VistaReserva;
import Vista.VistaUsuario;



public class Sistema_Gestion_Reserva_Transporte_Final {

    public static void main(String[] args) {
      
         ControladorConductor conductor = new ControladorConductor(new Vista.VistaConductor());
         ControladorTren tren = new ControladorTren(new Vista.VistaTren());
         ControladorAutobus autobus = new ControladorAutobus(new Vista.VistaAutobus());
         ControladorVehiculo vehiculo = new ControladorVehiculo();
         ControladorItinerario itinerario = new ControladorItinerario(new Vista.VistaItinerario(), conductor, vehiculo);
         ControladorUsuario usuario = new ControladorUsuario(new VistaUsuario());
         ControladorReserva reserva = new ControladorReserva(new VistaReserva(), usuario, itinerario);
        int opcion;
        
        conductor.add(conductor.Crear(new String[]{"pepito","123","20","lunes,martes,viernes"}));
        tren.add(tren.Crear(new String[]{"H1324","60","20"}));
        autobus.add(autobus.Crear(new String[]{"PLK-126","20","AireAcondicionado"}));
        itinerario.add(itinerario.Crear(new String[]{"4:30","14/11/2025","Aguachica,penjamo","5"}));
        
        do {
            
            Menu menu = new Menu(new String[]{
                "MENÚ PRINCIPAL","Gestionar Itinerario","Gestionar Vehiculos","Gestionar Conductor" , "Gestionar Reserva"
            });
            Menu menu2 = new Menu(new String[]{
                "Que tipo de vehiculos deseas gestionar?","tren","autobus","listar vehiculos"
            });
            opcion = menu.Crear();

            switch (opcion) {
                case 1:
                    itinerario.ejecutar();
                    break;
                case 2:
                    int op2= menu2.Crear();
                    switch (op2) {
                        case 1:
                            tren.ejecutar();
                            break;
                        case 2:
                            autobus.ejecutar();
                            break;
                        case 3:
                            vehiculo.GraficarLista();
                            break;
                        case -1:
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 3:
                    conductor.ejecutar();
                case 4:
                    reserva.ejecutar();
                case -1:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != -1);
        
        
    }
    
}
