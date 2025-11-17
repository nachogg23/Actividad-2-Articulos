import articulos.*;
import usuarios.*;

public class Main {
    public static void main(String[] args) {

        // Artículos
        Libro libro1 = new Libro("El misterio", 2010, 2.5, "Carlos Ruiz", 320);
        Libro libro2 = new Libro("Historia épica", 2005, 1.8, "Juan López", 100);
        System.out.println("Libro 1: " + libro1.toString());
        System.out.println("Libro 2: " + libro2.toString());

        Pelicula pelicula1 = new Pelicula("Matrix", 1999, 3.5, "Wachowski", 136);
        Pelicula pelicula2 = new Pelicula("Avatar", 2009, 4.0, "James Cameron", 162);
        System.out.println("Pelicula 1: " + pelicula1.toString());
        System.out.println("Pelicula 2: " + pelicula2.toString());

        AlbumMusica album1 = new AlbumMusica("Hits 2020", 2020, 1.2, "Various", 12, false);
        AlbumMusica album2 = new AlbumMusica("Single Top", 2019, 0.8, "DJ One", 1, true);
        System.out.println("Album 1: " + album1.toString());
        System.out.println("Album 2: " + album2.toString());

        Videojuego juego1 = new Videojuego("Cyberpunk", 2020, 5.0, "CDPR", "PC, PS5", 18);
        Videojuego juego2 = new Videojuego("Mario Kart", 2017, 3.0, "Nintendo", "Switch", 3);
        System.out.println("Videojuego 1: " + juego1.toString());
        System.out.println("Videojuego 2: " + juego2.toString());

        // Clientes
        Cliente cliente1 = new Cliente("juan", "contrasenya123", 1, 2000, libro1, 100);
        Cliente cliente2 = new Cliente("maria", "passwordsegura", 2, 1998, pelicula2, 101);
        System.out.println("Cliente 1: " + cliente1.toString());
        System.out.println("Cliente 2: " + cliente2.toString());

        // Administrador
        Administrador admin = new Administrador("admin1", "claveadminsuper", 99, 1980);

        admin.asignarArticulo(cliente1, juego1);

    }
}


