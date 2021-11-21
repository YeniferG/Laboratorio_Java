package Ejercicio_14;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {

        List listaNumeros = new ArrayList();
        int limite = 1000;

        System.out.println("Por favor ingrese un número entero: ");
        int num = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero: "));
        for(int i = num; i<=1000; i++){
            listaNumeros.add(i);
            i+=1;
        }
        System.out.println("Los números de 2 en 2 desde el " + num + " hata el " + limite + " son: \n" + listaNumeros);
    }

}
