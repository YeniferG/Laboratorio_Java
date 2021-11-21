package Ejercicio_15;

import java.util.Scanner;

public class Menu {

    Scanner entrada = new Scanner(System.in);

    public void mostrarMenu(){

        System.out.println("****** GESTION CINEMATOGRAFICA ********" +
                        "\n1-NUEVO ACTOR \n2-BUSCAR ACTOR \n3-ELIMINAR ACTOR \n4-MODIFICAR ACTOR" +
                        "\n5-VER TODOS LOS ACTORES \n6- VER PELICULAS DE LOS ACTORES " +
                        "\n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n8-SALIR");

    }

    public void cargarMenu(){

        boolean recargar = true;
        mostrarMenu();

        while(recargar){
            System.out.println("---------------------------------------------------------------");
            System.out.println("Por favor selecciona una de las opciones anteriores ");
            int opcion = entrada.nextInt();
            System.out.println("---------------------------------------------------------------");
            switch (opcion){
                case 1:
                    mostrarMenu();
                    break;
                case 2:
                    mostrarMenu();
                    break;
                case 3:
                    mostrarMenu();
                    break;
                case 4:
                    mostrarMenu();
                    break;
                case 5:
                    mostrarMenu();
                    break;
                case 6:
                    mostrarMenu();
                    break;
                case 7:
                    mostrarMenu();
                    break;
                case 8:
                    recargar = false;
                    System.out.println("*** Gracias por participar, VUELVE PRONTO ***");
                    break;
                default:
                    System.out.println("OPCION INCORRECTO");
                    mostrarMenu();
            }
        }

    }

}
