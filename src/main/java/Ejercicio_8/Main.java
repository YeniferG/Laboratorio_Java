package Ejercicio_8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("*** Dias de la Semana Laborales ***");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor digite un día de la semana: ");
        String diaSemana = entrada.nextLine();
        diaSemana = diaSemana.toUpperCase();
        switch (diaSemana){
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("El " + diaSemana + " es un día de jornada laboral");
                break;
            case "SABADO":
            case "DOMINGO":
                System.out.println("El " + diaSemana + " no es un día laboral");
                break;
            default:
                System.out.println("La informacion ingresada no corresponde con un dia de la semana");
        }

    }

}
