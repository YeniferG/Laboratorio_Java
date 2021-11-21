package Ejercicio_16;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("*** Información Personal ***\n");
        try {
            for (int i = 1; i <= 3; i++) {
                String nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre: ");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su edad: "));
                char sexo = JOptionPane.showInputDialog("Por favor ingrese su sexo ('H' para hombre y 'M' para mujer:) ").toUpperCase().charAt(0);
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite su peso en kg: "));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite su estatura: "));

                if(i == 1){
                    Persona p1 = new Persona(nombre, sexo, edad, peso, altura);
                    System.out.println("PERSONA 1: \n----------------------------");
                    System.out.println(p1.imprimirEdad(p1.esMayorDeEdad()));
                    System.out.println(p1.imprimirIMC(p1.calcularIMC()));
                    System.out.println(p1.toString());
                    System.out.println("************************************************************************");
                } else if (i == 2) {
                    Persona p2 = new Persona(nombre, sexo, edad);
                    p2.setAltura(altura);
                    p2.setPeso(peso);
                    System.out.println("PERSONA 2: \n----------------------------");
                    System.out.println(p2.imprimirEdad(p2.esMayorDeEdad()));
                    System.out.println(p2.imprimirIMC(p2.calcularIMC()));
                    System.out.println(p2.toString());
                    System.out.println("************************************************************************");
                } else {
                    Persona p3 = new Persona();
                    p3.setNombre(nombre);
                    p3.setEdad(edad);
                    p3.setSexo(sexo);
                    p3.setPeso(peso);
                    p3.setAltura(altura);
                    System.out.println("PERSONA 3: \n----------------------------");
                    System.out.println(p3.imprimirEdad(p3.esMayorDeEdad()));
                    System.out.println(p3.imprimirIMC(p3.calcularIMC()));
                    System.out.println(p3.toString());
                    System.out.println("************************************************************************");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
