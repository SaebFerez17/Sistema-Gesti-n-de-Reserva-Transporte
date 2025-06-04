
package Utilidades;


public class Fecha {
    
    private int [] fecha = new int[3];
    private int [] hora = new int[2];

    public Fecha(String fecha, String hora) {
        setFecha(fecha);
        setHora(hora);
    }
    
    

    public int[] getFecha() {
        return fecha;
    }
    
    public int[] getHora() {
        return hora;
    }

    public void setFecha(String msj) {
        String [] partes = msj.split("/");
        int [] fechapartes = new int[3];
        if (partes.length == 3){
                for (int i = 0; i < 3; i++) {
                    fecha[i] = Integer.parseInt(partes[i].trim());
                }
                this.fecha = fechapartes;
        }else {
            System.out.println("Error: Solo ingrese [dd/mm/aa]");
        }
    }


    public void setHora(String msj) {
        String [] partes = msj.split(":");
        int [] horapartes = new int[2];
        if (partes.length == 2){
            for (int i = 0; i < 2; i++) {
                horapartes[i] = Integer.parseInt(partes[i].trim());
            }
            this.hora = horapartes;
        }else {
            System.out.println("Error: Solo ingrese [hh:mm]");
        }    
    }
    
    public String fechaString (){
        String[] fechastring = new String[3];
        for (int i = 0; i < 3; i++) {
            fechastring[i] = String.valueOf(fecha[i]);
        }
        return String.join("/", fechastring);
    }
    
    public String horaString (){
        String[] horaString = new String[2];
        for (int i = 0; i < 3; i++) {
            horaString[i] = String.valueOf(hora[i]);
        }
        return String.join(":", horaString);
    }

    @Override
    public String toString() {
        return "Fecha{" + "fecha=" + fechaString() + ", hora=" + horaString() + '}';
    }
    
    
    
}
