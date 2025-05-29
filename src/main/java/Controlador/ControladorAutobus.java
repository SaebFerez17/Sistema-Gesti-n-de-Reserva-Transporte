
package Controlador;

import Modelo.Autobuses;
import Vista.VistaAutobus;
import java.util.ArrayList;

public class ControladorAutobus{
    
    private VistaAutobus vista;
    private ArrayList<Autobuses> autobuses;

    public ControladorAutobus(VistaAutobus vista) {
        this.vista = vista;
    }
    
    public void Ejecutar(){
        int op = 0;
        do {            
            op = vista.Menu();
            Casos(op);
        } while (op!=0);
    }
    
    public void Casos(int op){
        switch (op) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
                
            default:
                throw new AssertionError();
        }
        
        
    }
    
    
        
}
