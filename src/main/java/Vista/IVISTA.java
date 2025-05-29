/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Vista;

/**
 *
 * @author sebas
 */
public interface IVISTA {
    int menu();
    String[] IngresarDatos();
    String getString(String msj);
    int getInt(String msj);
    long getLong(String msj);
    String[] StringToList(String texto);
}
