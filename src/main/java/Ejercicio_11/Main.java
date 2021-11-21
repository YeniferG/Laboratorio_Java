package Ejercicio_11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("*** Longitud de una Frase ***\n");
        System.out.println("Por favor introduce una frase: ");
        String frase= entrada.nextLine();
        System.out.println("La frase ingresada es: " + frase);
        System.out.println("----------------------------------------------");
        int longitud = frase.length();
        int longitudSinEspacios = frase.replace(" ", "").length();

        for (int j = 0; j < longitud; j++) {
            char texto = frase.toLowerCase().charAt(j);
            switch (texto) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Total de vocales: " + (a+e+i+o+u));
        System.out.println("Cantidad de a: " + a + "\nCantidad de e: " + e + "\nCantidad de i: " + i + "" +
                "\nCantidad de o: " + o + "\nCantidad de u: " + u);
        System.out.println("----------------------------------------------");
        System.out.println("La longitud de la frase de texto es: "+longitud);
        System.out.println("----------------------------------------------");
        System.out.println("La longitud de la frase de texto sin espacios es: "+longitudSinEspacios);

    }

}
