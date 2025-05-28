
package Controlador;


public interface IMETODOSCRUD<T,L> {
    void add(T obj);
    void delete(T obj);
    void update(T obj, Object objeto);
    void toList();
    int buscar(L obj);
}