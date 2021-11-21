package Ejercicio_10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("*** Eliminar espacios de una Frase ***");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase: ");
        String frase = entrada.nextLine();
        System.out.println("La frase ingresada es: " + frase);
        System.out.println("---------------------------------------------------");
        String fraseSinEspacios = frase.replace(" ", "");
        System.out.println("La frase sin espacios es: " + fraseSinEspacios);

    }

}
