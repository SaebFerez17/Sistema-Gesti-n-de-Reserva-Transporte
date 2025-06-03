
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
            Casos(op);
        } while (op!=-1);
    }
    
    @Override
    public void Casos(int op){
        switch (op) {
            case 1:
                add(Crear(vista.IngresarDatos()));
                break;
            case 2:
                delete(buscar(vista.getString("Digite la Placa del vehiculo a eliminar: ")));
                break;
            case 3:
                Autobuses autobuses = Crear(vista.IngresarDatos());
                update(buscar(autobuses.getId()),autobuses);
                break;
            case 4:
                vista.GraficarLista(new ArrayList<>(this.getLista()));
                break;
                
            default:
                throw new AssertionError();
        }
        
        
    }
    @Override
    public Autobuses Crear(String[] datos){
        Autobuses autobuses = new Autobuses(datos[0] ,Integer.parseInt(datos[1]), datos[2].split(";"));
        return autobuses;
    }
      
}
