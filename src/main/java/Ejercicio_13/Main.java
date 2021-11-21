package Ejercicio_13;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //Forma 1
        System.out.println("*** Fecha y Hora Actual ***\n");
        Date fecha = new Date(new Date().getTime());
        String fechaFormato =new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(fecha);
        System.out.println("La Fecha y Hora en el formato (AAAA/MM/DD) (HH:MM:SS) son: " + fechaFormato);
        System.out.println("_________________________________________________");

        //Forma 2
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La Fecha y Hora en el formato (AAAA/MM/DD) (HH:MM:SS) son: " + dtf.format(LocalDateTime.now()));
    }

}
