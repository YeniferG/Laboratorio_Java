package Ejercicio_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final double PI = Math.PI;
        double radio;
        double areaCirculo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("*** Bienvenido al programa calculador de Area ***\n");
        System.out.println("Por favor ingrese el radio del circulo para calcular su respectiva area: ");
        radio = Double.parseDouble(entrada.nextLine());
        areaCirculo = PI * Math.pow(radio,2);
        System.out.println("El area del circulo es: " + areaCirculo);

    }

}
