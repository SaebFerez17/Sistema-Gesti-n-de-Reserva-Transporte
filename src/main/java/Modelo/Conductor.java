
package Modelo;

public class Conductor extends Persona{
    private double salario;
    private String[] diasATrabajar;
    private String[] dias= {"LUNES","MARTES","MIERCOLES","JUEVE","VIERNES","SABADO","DOMINGO"};
    private boolean[] disponibilidad;
    
    
    public Conductor() {
        
    }

    public Conductor(String nombre, long cedula, double salario, String[] diasATrabajar) {
        super(nombre, cedula);
        this.salario = salario;
        this.diasATrabajar = diasATrabajar;
        this.disponibilidad = Disponibilidad(diasATrabajar);
        
    }

    public boolean[] Disponibilidad(String[] diasATrabajar){
        boolean[] disponibilidad = new boolean[7];
        int indice = 0;
        for (String b : dias) {
            disponibilidad[indice] = false;
            for (String c : diasATrabajar) {
                if (b.equals(c)) {
                    disponibilidad[indice] = true;
                    break;
                }
            }
            indice++;
            
        }
        return disponibilidad;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String[] getDiasATrabajar() {
        return diasATrabajar;
    }

    public void setDiasATrabajar(String[] diasATrabajar) {
        this.diasATrabajar = diasATrabajar;
        this.disponibilidad = Disponibilidad(diasATrabajar);
    }

    @Override
    public String toString() {
        for (String string : diasATrabajar) {
            System.out.print(string + ",");
        }
        System.out.println("");
        for (boolean string : disponibilidad) {
            System.out.print(string + ",");
        }
        System.out.println("");
        return "Conductor{" + "nombre=" + this.getNombre() + "cedula=" + this.getCedula() + "salario=" + salario;
    }
    
    
    
}
