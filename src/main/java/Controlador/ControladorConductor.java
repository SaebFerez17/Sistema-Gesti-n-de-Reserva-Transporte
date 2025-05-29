/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conductor;
import Vista.VistaConductor;
import java.util.ArrayList;

/**
 *
 * @author spico
 */
public class ControladorConductor implements IMETODOSCRUD<Integer, Long>{
    private VistaConductor vista;
    private ArrayList<Conductor> lista = new ArrayList<>();

    public ControladorConductor(VistaConductor vista) {
        this.vista = vista;
    }
    
    public void Ejecutar(){
        int op = 0;
        do {  
            op=vista.menu();
            Casos(op);
            
        } while (op!=-1);
    }
    
    public void Casos(int op){
        switch (op) {
            case 1:
                add(2);
                break;
            case 2:
                int indice=buscar(vista.getLong("Ingrese la Cedula del Conductor: "));
                delete(indice);
                break;
            case 3:
                Conductor conductor= CrearConductor(vista.IngresarDatos());
                update(buscar(conductor.getCedula()), conductor);
                break;
            case 4:
                toList();
                break;

            default:
                throw new AssertionError();
        }
    }
    
    public Conductor CrearConductor(String[] datos){
        Conductor conductor = new Conductor(datos[0],Long.parseLong(datos[1]),Double.parseDouble(datos[2]), vista.StringToList(datos[3]));
        return conductor;
    }
    
    @Override
    public void add(Integer indice) {
        Conductor conductor= CrearConductor(vista.IngresarDatos());
        lista.add(conductor);
    }

    @Override
    public void delete(Integer indice) {
        lista.remove((int)indice);
    }

    @Override
    public void update(Integer indice, Object conductor) {
        lista.set((int)indice, (Conductor)conductor);
    }

    @Override
    public void toList() {
        for (Conductor conductor : lista) {
            System.out.println(conductor.toString());
        }
    }

    @Override
    public int buscar(Long cc) {
        int pos=0;
        for (Conductor conductor : lista) {
            if (conductor.getCedula()==cc) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
}
