
package Controlador;


public interface IMETODOSCRUD<Obj,Id> {
    void ejecutar();
    void Casos(int obj);
    Obj Crear(String[] datos);
    void add(Obj objeto);
    void delete(int obj);
    void update(int obj, Obj objeto);
    void toList();
    int buscar(Id obj);
}