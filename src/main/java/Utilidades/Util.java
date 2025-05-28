/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Util {
    
    private static Scanner escaner = new java.util.Scanner(System.in);
    
    public static int menu(String[] opciones){
        Menu menu = new Menu(opciones);
        return menu.Crear();
    }
    
    public static int getInt(String msg){
        System.out.println(msg);
        int numero = escaner.nextInt();
        escaner.nextLine();  
        return numero;
    }
    
    public static String getString(String msg){
        System.out.println(msg);
        return escaner.nextLine();
    }
    
    public static long getLong(String msg){
        System.out.println(msg);
        return escaner.nextInt();
    }
   public static String[] getLista(String msg){
        System.out.println(msg);
        String texto=escaner.next();
        String[] lista = texto.split(",");
        return lista;
   }
    
}
