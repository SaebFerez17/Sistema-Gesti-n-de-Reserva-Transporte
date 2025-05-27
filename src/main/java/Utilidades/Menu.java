/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;
import Utilidades.Util;
/**
 *
 * @author sebas
 */
public class Menu {

    private String[] opciones;
    

    
    public Menu(String[] opciones) {
        this.opciones = opciones;
    }
    
    public int Crear(){
        for (String opcione : opciones) {
            System.out.println(opcione);
        }
        System.out.println("-1) Salir");
        return Util.getInt("Seleccione una opcion: ");
    }
    
}
