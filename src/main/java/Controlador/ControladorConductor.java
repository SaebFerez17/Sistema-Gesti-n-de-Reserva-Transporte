
package Controlador;

import Modelo.Conductor;
import Vista.VistaConductor;
import java.util.ArrayList;


public class ControladorConductor implements IMetodosCRUD<Conductor, Long>{
    private VistaConductor vista;
    private ArrayList<Conductor> lista = new ArrayList<>();

    public ControladorConductor(VistaConductor vista) {
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
                Conductor conductor = crear(vista.ingresarDatos());
                if (conductor != null){
                    add(conductor);
                }else{
                    vista.mostrarMensaje("No se ha agregado al usuario");
                }
                
                break;
            case 2:
                int indice=buscar(vista.getLong("Ingrese la Cedula del Conductor: "));
                delete(indice);
                break;
            case 3:
                Conductor con = crear(vista.ingresarDatos());
                update(buscar(con.getCedula()), con);
                break;
            case 4:
                vista.graficarLista(new ArrayList<>(lista));

                break;
            case -1:
                break;
            default:
                throw new AssertionError();
        }
    }
    
    @Override
    public Conductor crear(String[] datos){
        Conductor conductor = new Conductor(datos[0],Long.parseLong(datos[1]),Double.parseDouble(datos[2]), vista.stringToList(datos[3]));
        return conductor;
    }
    
    @Override
    public void add(Conductor conductor) {
        lista.add(conductor);
    }

    @Override
    public void delete(int indice) {
        lista.remove((int)indice);
    }

    @Override
    public void update(int indice, Conductor conductor) {
        lista.set((int)indice, conductor);
    }

    @Override
    public ArrayList<Conductor> toList() {
        return lista;
    }

    @Override
    public int buscar(Long cc) {
        int pos=0;
        for (Conductor conductor : lista) {
            if (conductor.getCedula()==cc) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
    
    @Override
    public Conductor encontrar(Long cc) {
        for (Conductor conductor : lista) {
            if (conductor.getCedula()==cc) return conductor;
        }
        return null;
    }
    
    public void graficarlista(){
        vista.graficarLista(new ArrayList<>(lista));
    }

}
