
package Controlador;

import Modelo.Autobuses;
import Vista.VistaAutobus;
import java.util.ArrayList; 

public class ControladorAutobus implements IMETODOSCRUD<Autobuses,String>{
    
    private  VistaAutobus vista;
    private  ArrayList<Autobuses> lista = new ArrayList<>();

    public ControladorAutobus(VistaAutobus vista) {
        this.vista = vista;
    }
    
    @Override
    public void ejecutar(){
        int op = 0;
        do {            
            op = vista.menu();
            Casos(op);
        } while (op!=0);
    }
    
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
                toList();
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

    @Override
    public void add(Autobuses a) {
        if (buscar(a.getId()) == -1){
            lista.add(a);
        }
    }

    @Override
    public void delete(int indice) {
        lista.remove(indice);   
    }

    @Override
    public void update(int indice, Autobuses a) {
        lista.set(indice, a);
    }

    @Override
    public ArrayList<Autobuses> toList() {
        return lista;
    }

    @Override
    public int buscar(String id) {
        int pos=0;
        for (Autobuses item : lista) {
            if (item.getId().equals(id)) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
    
    @Override
    public Autobuses encontrar(String id) {
        for (Autobuses item : lista) {
            if (item.getId().equals(id)) return item;
        }
        return null;
    }
      
}
