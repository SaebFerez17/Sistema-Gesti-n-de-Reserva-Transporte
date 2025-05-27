
package Controlador;
import Vista.VistaUsuario;
import Modelo.Usuario;
import java.util.ArrayList;

public class ControladorUsuario implements IMETODOSCRUD{
    private ArrayList<Usuario> lista = new ArrayList<>();
    private VistaUsuario vista;

    public ControladorUsuario(VistaUsuario vista) {
        this.vista = vista;
    }
    
    public void Ejecutar(){
        int op = 0;
        do {
            op = vista.Menu();
            Casos(op);

        }while (op != -1);
        
    }
    
    public void Casos(int op){
        switch (op) {
            case 1:
                add();
                break;
            case 2:
                delete();
                break;
            case 3:
                update();
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
    public void add() {
        Usuario usuario = CrearUsuario(vista.IngresarUsuario());
        lista.add(usuario);
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void toList() {
        for (Usuario usuario : lista) {
            System.out.println(usuario.toString());
        }
    }

    @Override
    public int buscar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
