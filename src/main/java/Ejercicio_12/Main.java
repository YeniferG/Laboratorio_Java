package Ejercicio_12;

import java.util.Scanner;

public class Main {

    public static String direnciaPalabras(String palabra1, String palabra2) {
        String diferencia="";
        for (int i = 0; i < palabra1.length(); i++) {
            if (i < palabra2.length()) {
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    diferencia += "En la Posicion "+i+" la letra  de la palabra 1 : " + palabra1.charAt(i) + " es diferente a la letra " + palabra2.charAt(i)+" de la palabra 2\n";
                }
            } else {
                diferencia += "En la Posicion " + i + " la letra de la palabra  1 es: " + palabra1.charAt(i) + " y no tiene una letra para compararse en la palabra 2\n";
            }
        }
        return diferencia;
    }
    public static String diferenciaEntrePalabras(String palabra1, String palabra2) {
        String respuesta = "";

        if (palabra1.length() > palabra2.length()) {
            respuesta=direnciaPalabras(palabra1,palabra2);
        } else if (palabra2.length() < palabra2.length()) {
            respuesta=direnciaPalabras(palabra2,palabra1);
        }else {
            System.out.println("Las palabras ingresadas son diferentes");
            for (int i = 0; i < palabra1.length(); i++) {
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    respuesta += "En la posicion "+i+" la letra  de la palabra 1: " + palabra1.charAt(i) + ", es diferente a la letra: " + palabra2.charAt(i)+" de la palabra 2.\n";
                }
            }
        }
        return respuesta;
    }
    public static Boolean siIguales(String palabra1, String palabra2) {
        return palabra1.equals(palabra2) ? true : false;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("*** Comparación de Palabras");
        System.out.println("Ingresa la primera palabra por favor: ");
        String palabra1 = entrada.nextLine();
        System.out.println("Ingresa la segunda palabra por favor: ");
        String palabra2 = entrada.nextLine();
        System.out.println("Las palabras ingresadas fueron: " + palabra1 + " y " + palabra2);
        System.out.println("-----------------------------------------------------------");

        if (siIguales(palabra1, palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println(diferenciaEntrePalabras(palabra1, palabra2));
        }
    }

}
