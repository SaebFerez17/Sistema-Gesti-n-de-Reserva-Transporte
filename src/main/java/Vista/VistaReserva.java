
package Vista;

import Utilidades.Util;


public class VistaReserva extends Vista{

    public VistaReserva() {
        super("Reserva");
    }
    
    @Override
    public int menu() {
        String[] opciones = {"Menu de Reservas", "Agregar", "Borrar", "Actualizar", "Listar"};
        return Util.menu(opciones);
    }

    @Override
    public String[] ingresarDatos() {
        String[] datos = new String[3];
        datos[0] = String.valueOf(Util.getLong("Ingrese la cedula del usuario: "));
        datos[1] = Util.getString("Ingrese el ID del itinerario: ");
        datos[2] = String.valueOf(Util.getInt("Ingrese el tipo de puesto (0 = primera clase, 1 = económica): "));
        return datos;
    }
    
}
