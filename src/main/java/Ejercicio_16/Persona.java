package Ejercicio_16;

public class Persona {

    private String nombre = "";
    private char sexo = 'H'; //Si se hace constante, cómo se arman constructores?
    private int edad = 0;
    private String dni = "";
    private double peso = 0;
    private double altura = 0;
    private char[] letraDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Persona() {
        this.dni = generaDNI();
    }

    public Persona(String nombre, char sexo, int edad) {
        this.nombre = nombre;
        this.sexo = comprobarSexo(sexo);
        this.edad = edad;
        this.dni = generaDNI();
    }

    public Persona(String nombre, char sexo, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.dni = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = this.peso / (Math.pow(this.altura, 2)); //Enviar constantes?
        if (imc < 20.0) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        }
        return false;

    }

    private char comprobarSexo(char sexo) {
        if (sexo != 'M') {
            return 'H';
        }
        return sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad + imprimirEdad(esMayorDeEdad()) +
                ", peso=" + peso + imprimirIMC(calcularIMC()) +
                ", altura=" + altura +
                '}';
    }

    public String generaDNI() {
        int numeroRandom = (int) (Math.random() * (99999999 - 10000000) - 10000000);
        int indice = numeroRandom % 23;
        char letra = letraDNI[indice];
        String DNI = String.valueOf(numeroRandom) + letra;
        return DNI;
    }

    public String imprimirIMC(int imc){
        if (imc == -1) {
            return " Está por debajo del peso";
        } else if (imc == 0) {
            return " Está en el peso ideal";
        } else{
            return " Está por encima del peso. Sobrepeso";
        }
    }

    public String imprimirEdad(boolean mayor){
        if (mayor == true) {
            return " Es mayor de edad";
        }else{
            return " Es menor de edad";
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
