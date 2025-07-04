
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
       while (!escaner.hasNextInt()) {
           System.out.println("Entrada Invalida Ingresa un entero");           
           escaner.next();
       }
       int value = escaner.nextInt();
       escaner.nextLine(); 
       return value;
   }
    
    public static String getString(String msg){
        System.out.println(msg);
        return escaner.nextLine();
    }
    
    public static long getLong(String msg){
       System.out.println(msg);
       while (!escaner.hasNextLong()) {
           System.out.println("Entrada Invalida Ingresa un numero ");           
           escaner.next();
       }
       long value = escaner.nextLong();
       escaner.nextLine(); 
       return value;
   }
   public static String[] stringToList(String texto){
        String[] lista = texto.split(",");
        for (int i = 0; i < lista.length; i++) {
           lista[i] = lista[i].trim().toUpperCase();
       }
        return lista;
   }
    
}
