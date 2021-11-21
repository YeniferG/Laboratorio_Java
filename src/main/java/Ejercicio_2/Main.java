package Ejercicio_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("*** Comparación de Numeros ***\n");
        System.out.println("Por favor ingresar el primer valor numerico: ");
        double num1 = entrada.nextDouble();
        System.out.println("Por favor ingresar el segundo valor numerico: ");
        double num2 = entrada.nextDouble();

        if(num1 > num2){
            System.out.println("El numero " + num1 + " es mayor al numero " + num2);
        }
        else if(num1 < num2){
            System.out.println("El numero " + num1 + " es menor al numero " + num2);
        }
        else if(num1 == num2){
            System.out.println("Los numeros son iguales");
        }



    }

}
