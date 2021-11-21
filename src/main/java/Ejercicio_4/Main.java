package Ejercicio_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int IVA = 21;

        Scanner entrada = new Scanner(System.in);
        System.out.println("*** Productos con IVA incluido ***\n");
        System.out.println("Por favor ingresar el valor de un producto sin IVA incluido: ");
        double precioInicialProducto = entrada.nextDouble();
        double precioFinalProducto = ((precioInicialProducto * IVA)/100 + (precioInicialProducto));
        System.out.println("El valor del producto con Iva incluido es: " + precioFinalProducto);

    }

}
