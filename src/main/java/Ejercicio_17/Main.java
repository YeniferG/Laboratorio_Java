package Ejercicio_17;

public class Main {

    public static void main(String[] args) {

        System.out.println("*** Electrodomesticos ***\n");

        double sumaElectrodomesticos = 0;
        double sumaLavadoras = 0;
        double sumaTelevisiones = 0;
        int contadorElemento = 0;
        Electrodomestico[] listaElectrodomesticos = new Electrodomestico[10];

        listaElectrodomesticos[0] = new Electrodomestico();
        listaElectrodomesticos[1] = new Electrodomestico(300, 2);
        listaElectrodomesticos[2] = new Electrodomestico(200, "azul", 'B', 35);
        listaElectrodomesticos[3] = new Lavadora();
        listaElectrodomesticos[4] = new Lavadora(200, 50);
        listaElectrodomesticos[5] = new Lavadora(120, "rojo", 'B', 60, 50);
        listaElectrodomesticos[6] = new Lavadora(80, 35);
        listaElectrodomesticos[7] = new Television();
        listaElectrodomesticos[8] = new Television(120, 50);
        listaElectrodomesticos[9] = new Television(180, "gris", 'C', 40, 45, true);

        for (Electrodomestico elemento : listaElectrodomesticos) {

            System.out.println("El precio del elemento " + contadorElemento);
            System.out.println(elemento.precioFinal());
            sumaElectrodomesticos += elemento.precioFinal();
            if (elemento instanceof Lavadora){
                sumaLavadoras += elemento.precioFinal();
            }
            else if (elemento instanceof Television) {
                sumaTelevisiones += elemento.precioFinal();
            }
            contadorElemento++;
        }

        System.out.println("La suma de los electrodómesticos es: " + sumaElectrodomesticos);
        System.out.println("La suma de las lavadoras es: " + sumaLavadoras);
        System.out.println("La suma de los televisores es: " + sumaTelevisiones);

    }

}
