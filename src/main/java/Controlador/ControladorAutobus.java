
package Controlador;

import Modelo.Autobuses;
import Modelo.Usuario;
import Vista.VistaAutobus;
import java.util.ArrayList;

public class ControladorAutobus implements IMETODOSCRUD<Autobuses,String>{
    
    private VistaAutobus vista;
    private ArrayList<Autobuses> lista = new ArrayList<>();

    public ControladorAutobus(VistaAutobus vista) {
        this.vista = vista;
    }
    
    public void Ejecutar(){
        int op = 0;
        do {            
            op = vista.menu();
            Casos(op);
        } while (op!=0);
    }
    
    public void Casos(int op){
        switch (op) {
            case 1:
                add(CrearAutobus(vista.IngresarDatos()));
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
    
    public Autobuses CrearAutobus (String[] datos){
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
    public void delete(String placa) {
        int indice = buscar(placa);
        if (indice != -1){
            lista.remove(lista.get(indice));
        }
    }

    @Override
    public void update(Integer indice, Object usuario) {
        lista.set((int)indice, (Usuario)usuario);
    }

    @Override
    public void toList() {
        for (Usuario usuario : lista) {
            System.out.println(usuario.toString());
        }
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

    
    
        
}
