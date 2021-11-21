package Ejercicio_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num = 1;
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        System.out.println("*** Numeros Pares y Impares ***\n");
        System.out.println("Por favor ingrese el rango maximo para obtener los numeros pares e impares: ");
        Scanner entrada = new Scanner(System.in);
        int rangoMax = entrada.nextInt();

        while (num <= rangoMax){
            if(num % 2 == 0){
                numerosPares.add(num);
                num++;
            }
            else{
                numerosImpares.add(num);
                num++;
            }
        }

        System.out.println("Los numeros pares en el rango de 1 a " + rangoMax + " es: " + numerosPares);
        System.out.println("Los numeros impares en el rango de 1 a " + rangoMax + " es: " + numerosImpares);

    }

}
