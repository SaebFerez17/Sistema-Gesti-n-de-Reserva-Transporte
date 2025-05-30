
package Controlador;

import Modelo.Tren;
import Vista.VistaTren;
import java.util.ArrayList;

public class ControladorTren implements IMETODOSCRUD<Tren, String>{
    private VistaTren vista;
    private ArrayList<Tren> lista = new ArrayList<>();

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
                int indice=buscar(vista.getString("Ingrese la Cedula del Conductor: "));
                delete(indice);
                break;
            case 3:
                Tren tren= Crear(vista.IngresarDatos());
                update(buscar(tren.getId()), tren);
                break;
            case 4:
                toList();
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
    
    @Override
    public void add(Tren conductor) {
        lista.add(conductor);
    }

    @Override
    public void delete(int indice) {
        lista.remove((int)indice);
    }

    @Override
    public void update(int indice, Tren conductor) {
        lista.set((int)indice, conductor);
    }

    @Override
    public ArrayList<Tren> toList() {
        return lista;
    }

    @Override
    public int buscar(String id) {
        int pos=0;
        for (Tren tren : lista) {
            if (tren.getId().equals(id)) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
    
    @Override
    public Tren encontrar(String id) {
        for (Tren tren : lista) {
            if (tren.getId().equals(id)) return tren;
        }
        return null;
    }

}
