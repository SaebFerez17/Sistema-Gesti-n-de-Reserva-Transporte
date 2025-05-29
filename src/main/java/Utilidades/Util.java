
package Utilidades;

import java.util.Scanner;

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
   public static String[] StringToList(String texto){
        String[] lista = texto.split(",");
        for (int i = 0; i < lista.length; i++) {
           System.out.println(lista[i]);
           lista[i] = lista[i].trim().toUpperCase();
           System.out.println(lista[i]);
       }
        return lista;
   }
    
}
