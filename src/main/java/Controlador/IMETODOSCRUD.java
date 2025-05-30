
package Controlador;

import java.util.ArrayList;


public interface IMETODOSCRUD<Obj,Id> {
    void ejecutar();
    void Casos(int num);
    Obj Crear(String[] datos);
    void add(Obj objeto);
    void delete(int num);
    void update(int num, Obj objeto);
    ArrayList<Obj> toList();
    int buscar(Id id);
    Obj encontrar(Id num);
}