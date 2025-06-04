
package Controlador;

import java.util.ArrayList;


public interface IMetodosCRUD<Obj,Id> {
    void ejecutar();
    void casos(int num);
    Obj crear(String[] datos);
    void add(Obj objeto);
    void delete(int num);
    void update(int num, Obj objeto);
    ArrayList<Obj> toList();
    int buscar(Id id);
    Obj encontrar(Id num);
}