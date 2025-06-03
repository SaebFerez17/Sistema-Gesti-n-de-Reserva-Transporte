
package Controlador;
import Vista.VistaUsuario;
import Modelo.Usuario;
import java.util.ArrayList;

public class ControladorUsuario implements IMETODOSCRUD<Usuario, Long>{
    private ArrayList<Usuario> lista = new ArrayList<>();
    private VistaUsuario vista;

    public ControladorUsuario(VistaUsuario vista) {
        this.vista = vista;
    }
    
    @Override
    public void ejecutar(){
        int op = 0;
        do {
            op = vista.menu();
            Casos(op);

        }while (op != -1);
        
    }
    
    @Override
    public void Casos(int op){
        switch (op) {
            case 1:
                Usuario usu = Crear(vista.IngresarDatos());
                if (usu != null){
                    add(usu);
                }else{
                    vista.MostrarMensaje("Usuario no agregado");
                }
                break;
            case 2:
                int indice=buscar(vista.getLong("Ingrese la Cedula del Usuario: "));
                delete(indice);
                break;
            case 3:
                Usuario usuario= Crear(vista.IngresarDatos());
                update(buscar(usuario.getCedula()),usuario);
                break;
            case 4:
               
                vista.GraficarLista(new ArrayList<>(lista));
                break;
            case -1:
                break;
            default:
                throw new AssertionError();
        }
    }
    
    @Override
    public Usuario Crear(String[] datos){
        Usuario usuario = new Usuario(datos[0],Long.parseLong(datos[1]));
        return usuario;
    }
    
    @Override
    public void add(Usuario usuario) {
        lista.add(usuario);
    }

    @Override
    public void delete(int indice) {
        lista.remove((int)indice);
    }

    @Override
    public void update(int indice, Usuario usuario) {
        lista.set(indice,usuario);
    }

    @Override
    public ArrayList<Usuario> toList() {
        return lista;
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

    @Override
    public Usuario encontrar(Long cc) {
        for (Usuario usuario : lista) {
            if (usuario.getCedula()==cc) return usuario;
        }
        return null;
    }


    
}
