package Ejercicio_9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("*** Cambio de Letras de una Frase ***\n");
        Scanner entrada = new Scanner(System.in);
        String textoOriginal = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("Frase Original: " + textoOriginal);
        System.out.println("-----------------------------------------------------------");
        String textoReemplazado =  textoOriginal.replace("a", "e");
        System.out.println("Frase Reemplazada: " + textoReemplazado);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Por favor ingrese la frase que desee adicionar a la frase original: ");
        String concatenarTexto = entrada.nextLine();
        System.out.println("La frase concatenada es: " + textoReemplazado + " " + concatenarTexto);
        System.out.println("-----------------------------------------------------------");
        String fraseCompleta = concatenarTexto.replace("a","e");
        System.out.println("La frase concatenada y reemplazada es: " + textoReemplazado + " " + fraseCompleta);

    }

}
