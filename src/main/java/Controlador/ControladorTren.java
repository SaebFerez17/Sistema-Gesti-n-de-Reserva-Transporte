
package Controlador;

import Modelo.Tren;
import Vista.VistaTren;
import java.util.ArrayList;

public class ControladorTren extends ControladorVehiculo{
    private VistaTren vista;

    public ControladorTren(VistaTren vista) {
        this.vista = vista;
    }
    
    @Override
    public void ejecutar(){
        int op = 0;
        do {  
            op=vista.menu();
            casos(op);
            
        } while (op!=-1);
    }
    
    @Override
    public void casos(int op){
        switch (op) {
            case 1:
                Tren tre = crear(vista.ingresarDatos());
                if (tre != null){
                    add(tre);
                }else{
                    vista.mostrarMensaje("Tren no agregadp");
                }
                
                break;
            case 2:
                int indice=buscar(vista.getString("Ingrese el identificador del tren: "));
                delete(indice);
                break;
            case 3:
                Tren tren= crear(vista.ingresarDatos());
                update(buscar(tren.getId()), tren);
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
    public Tren crear(String[] datos){
        Tren tren = new Tren(datos[0],Integer.parseInt(datos[1]),Integer.parseInt(datos[2]));
        return tren;
    }

}
