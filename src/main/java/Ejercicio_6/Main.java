package Ejercicio_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        System.out.println("*** Numeros Pares y Impares ***\n");
        System.out.println("Por favor ingrese el rango maximo para obtener los numeros pares e impares: ");
        Scanner entrada = new Scanner(System.in);
        int rangoMax = entrada.nextInt();

        for (int i = 1; i <= rangoMax; i++){
            if(i % 2 == 0){
                numerosPares.add(i);
            }
            else{
                numerosImpares.add(i);
            }
        }

        System.out.println("Los numeros pares e impares en el rango de 1 a " + rangoMax + " son: " +
                "\nNumeros Pares: " + numerosPares + "\nNumeros Impares: " + numerosImpares);

    }

}
