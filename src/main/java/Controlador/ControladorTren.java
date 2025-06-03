
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
                int indice=buscar(vista.getString("Ingrese el identificador del tren: "));
                delete(indice);
                break;
            case 3:
                Tren tren= Crear(vista.IngresarDatos());
                update(buscar(tren.getId()), tren);
                break;
            case 4:
               vista.GraficarLista(new ArrayList<>(this.getLista()));
                break;

            default:
                throw new AssertionError();
        }
    }
    
    @Override
    public Tren Crear(String[] datos){
        Tren tren = new Tren(datos[0],Integer.parseInt(datos[1]),Integer.parseInt(datos[2]));
        return tren;
    }

}
