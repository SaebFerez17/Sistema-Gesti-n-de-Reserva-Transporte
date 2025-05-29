
package Controlador;
import Vista.VistaUsuario;
import Modelo.Usuario;
import java.util.ArrayList;

public class ControladorUsuario implements IMETODOSCRUD<Integer, Long>{
    private ArrayList<Usuario> lista = new ArrayList<>();
    private VistaUsuario vista;

    public ControladorUsuario(VistaUsuario vista) {
        this.vista = vista;
    }
    
    public void Ejecutar(){
        int op = 0;
        do {
            op = vista.menu();
            Casos(op);

        }while (op != -1);
        
    }
    
    public void Casos(int op){
        switch (op) {
            case 1:
                add(2);
                break;
            case 2:
                int indice=buscar(vista.getLong("Ingrese la Cedula del Usuario: "));
                delete(indice);
                break;
            case 3:
                Usuario usuario= CrearUsuario(vista.IngresarDatos());
                update(buscar(usuario.getCedula()),usuario);
                break;
            case 4:
                toList();
                break;

            default:
                throw new AssertionError();
        }
    }
    
    public Usuario CrearUsuario(String[] datos){
        Usuario usuario = new Usuario(datos[0],Long.parseLong(datos[1]));
        return usuario;
    }
    
    @Override
    public void add(Integer indice) {
        Usuario usuario = CrearUsuario(vista.IngresarDatos());
        lista.add(usuario);
    }

    @Override
    public void delete(Integer indice) {
        lista.remove((int)indice);
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
    public int buscar(Long cc) {
        int pos=0;
        for (Usuario usuario : lista) {
            if (usuario.getCedula()==cc) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
    
    
}
