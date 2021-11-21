package Ejercicio_18;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int contadorSeries = 0;
        int contadorVideojuegos = 0;
        List<Serie> listaSeries = new ArrayList<>();
        listaSeries.add(new Serie("Baki", "Keisuke Itagaki"));
        listaSeries.add(new Serie("Alice in Borderland", "Haro Asō"));
        listaSeries.add(new Serie());
        listaSeries.add(new Serie("Los 100r", 7, "Ciencia Ficcion", "Jason Rothenberg"));
        listaSeries.add(new Serie("El juego del Calamar", 1, "Drama", "Hwang Dong-hyuk"));

        List<Videojuego> listaVideojuego = new ArrayList<>();
        listaVideojuego.add(new Videojuego("Call of Duty", 15));
        listaVideojuego.add(new Videojuego("Minecraft", 8, "Aventura Grafica", "Android"));
        listaVideojuego.add(new Videojuego());
        listaVideojuego.add(new Videojuego("Tomb Raider", 15, "Acción", "Square Enix"));
        listaVideojuego.add(new Videojuego("Spyro", 7 , "Aventura", "Activision"));

        listaSeries.get(1).entregar();
        listaSeries.get(4).entregar();
        listaVideojuego.get(0).entregar();
        listaVideojuego.get(1).entregar();
        listaVideojuego.get(2).entregar();

        for (Serie serie : listaSeries){
            if(serie.isEntregado()==true){
                contadorSeries += 1;
                serie.devolver();
            }
        }
        for (Videojuego videojuego : listaVideojuego) {
            if(videojuego.isEntregado()== true){
                contadorVideojuegos +=1;
                videojuego.devolver();
            }
        }
        System.out.println("\nSeries y Videojuegos entregados: ");
        System.out.println("El numero de series entregadas es: " + contadorSeries);
        System.out.println("El numero de videojuegos entregados es: " + contadorVideojuegos);

        System.out.println("\nSeries que mas temporadas tienen: ");
        System.out.println(listaSeries.stream().sorted((x, y)->y.compareTo(x)).findFirst().toString().replace("Optional[","").replace("]",""));

        System.out.println("\nVideojuegos con mas intensidad horaria: ");
        System.out.println(listaVideojuego.stream().sorted((x, y)->y.compareTo(x)).findFirst().toString().replace("Optional[","").replace("]",""));

    }

}
