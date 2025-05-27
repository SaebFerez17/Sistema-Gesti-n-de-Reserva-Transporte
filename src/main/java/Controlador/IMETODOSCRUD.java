/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controlador;

/**
 *
 * @author sebas
 */
public interface IMETODOSCRUD<T,L> {
    void add(T obj);
    void delete(T obj);
    void update(T obj, Object objeto);
    void toList();
    int buscar(L obj);
}