
package Controlador;

import Modelo.Autobuses;
import Vista.VistaAutobus;
import java.util.ArrayList; 

public class ControladorAutobus extends ControladorVehiculo{
    
    private  VistaAutobus vista;

    public ControladorAutobus(VistaAutobus vista) {
        this.vista = vista;
    }
    
    @Override
    public void ejecutar(){
        int op = 0;
        do {            
            op = vista.menu();
            casos(op);
        } while (op!=-1);
    }
    
    @Override
    public void casos(int op){
        switch (op) {
            case 1:
                add(crear(vista.ingresarDatos()));
                break;
            case 2:
                delete(buscar(vista.getString("Digite la Placa del vehiculo a eliminar: ")));
                break;
            case 3:
                Autobuses autobuses = crear(vista.ingresarDatos());
                update(buscar(autobuses.getId()),autobuses);
                break;
            case 4:
                vista.graficarLista(new ArrayList<>(this.toList()));
                break;
            case -1:
                break;
            default:
                throw new AssertionError();
        }
        
        
    }
    @Override
    public Autobuses crear(String[] datos){
        Autobuses autobuses = new Autobuses(datos[0] ,Integer.parseInt(datos[1]), vista.stringToList(datos[2]));
        return autobuses;
    }
      
}
