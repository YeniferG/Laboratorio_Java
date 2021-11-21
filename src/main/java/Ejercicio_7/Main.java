package Ejercicio_7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double num;

        System.out.println("*** Numero Mayor o Igual a Cero ***\n");

        do {
            System.out.println("Por favor ingrese un número para realizar su respectiva validación: ");
            num = entrada.nextDouble();
            if(num < 0){
                System.out.println("El numero ingresado es: " + num + " y es menor a 0");
            }
            else if(num > 0) {
                System.out.println("El número ingresado es: " + num + " y es mayor a 0");
            }else if(num == 0){
                System.out.println("El numero ingresado es: " + num + " y es igual a 0");
            }
        } while (num < 0);

    }

}
