
package Utilidades;


public class Fecha {
    
    private String [] fecha = new String[3];
    private String [] hora = new String[2];

    public Fecha(String fecha, String hora) {
        setFecha(fecha);
        setHora(hora);
    }
    
    

    public String[] getFecha() {
        return fecha;
    }
    
    public String[] getHora() {
        return hora;
    }

    public void setFecha(String msj) {
        String [] partes = msj.split("/");
        if (partes.length == 3){
                for (int i = 0; i < 3; i++) {
                    fecha[i] = partes[i].trim();
                }
                this.fecha = partes;
        }else {
            System.out.println("Error: Solo ingrese [dd/mm/aa]");
        }
    }


    public void setHora(String msj) {
        String [] partes = msj.split(":");
        if (partes.length == 2){
            for (int i = 0; i < 2; i++) {
                hora[i] = partes[i].trim();
            }
            this.hora = partes;
        }else {
            System.out.println("Error: Solo ingrese [hh:mm]");
        }    
    }
    
    public String FechaString (){
        return String.join("/", fecha);
    }
    
    public String HoraString (){
        return String.join(":", hora);
    }
    
}
