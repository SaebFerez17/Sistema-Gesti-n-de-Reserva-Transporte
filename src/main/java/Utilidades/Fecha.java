
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
    String[] partes = msj.split("/");
    
    if (partes.length == 3) {
        try {
            int dd = Integer.parseInt(partes[0].trim());
            int mm = Integer.parseInt(partes[1].trim());
            int aa = Integer.parseInt(partes[2].trim());

            if (dd > 0 && dd <= 31) {
                if (mm > 0 && mm <= 12) {
                    if (aa >= 0) {
                        this.fecha = new int[] { dd, mm, aa };
                    } else {
                        System.out.println("Error: El año no puede ser negativo");
                    }
                } else {
                    System.out.println("Error: El mes debe estar entre 1 y 12");
                }
            } else {
                System.out.println("Error: El día debe estar entre 1 y 31");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Formato inválido, asegúrese de ingresar números válidos [dd/mm/aa]");
        }
    } else {
        System.out.println("Error: Solo ingrese el formato correcto [dd/mm/aa]");
    }
}



    public void setHora(String msj) {
    String[] partes = msj.split(":");

    if (partes.length == 2) {
        try {
            int hora = Integer.parseInt(partes[0].trim());
            int minutos = Integer.parseInt(partes[1].trim());

            if (hora >= 0 && hora < 24) {
                if (minutos >= 0 && minutos < 60) {
                    this.hora = new int[] { hora, minutos };
                } else {
                    System.out.println("Error: Solo ingrese los minutos en un rango de 0 a 59");
                }
            } else {
                System.out.println("Error: Solo ingrese la hora en un rango de 0 a 23");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Formato inválido, asegúrese de ingresar números válidos [hh:mm]");
        }
    } else {
        System.out.println("Error: Solo ingrese el formato correcto [hh:mm]");
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
