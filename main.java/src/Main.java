import articulos.*;
import usuarios.*;

public class Main {
    public static void main(String[] args) {

        // Artículos
        Libro libro1 = new Libro("El misterio", 2010, 2.5, "Carlos Ruiz", 320);
        Libro libro2 = new Libro("Historia épica", 2005, 1.8, "Juan López", 100);


        Pelicula pelicula1 = new Pelicula("Matrix", 1999, 3.5, "Wachowski", 136);
        Pelicula pelicula2 = new Pelicula("Avatar", 2009, 4.0, "James Cameron", 162);

        AlbumMusica album1 = new AlbumMusica("Hits 2020", 2020, 1.2, "Various", 12, false);
        AlbumMusica album2 = new AlbumMusica("Single Top", 2019, 0.8, "DJ One", 1, true);

        Videojuego juego1 = new Videojuego("Cyberpunk", 2020, 5.0, "CDPR", "PC, PS5", 18);
        Videojuego juego2 = new Videojuego("Mario Kart", 2017, 3.0, "Nintendo", "Switch", 3);

        // Clientes
        Cliente cliente1 = new Cliente("juan", "contrasenya12345", 1, 2000, libro1, 100);
        Cliente cliente2 = new Cliente("maria", "passwordsegura", 2, 1998, pelicula2, 101);

        // Administrador
        Administrador admin = new Administrador("admin1", "claveadminsuper", 99, 1980);

        admin.asignarArticulo(cliente1, juego1);

        System.out.println(cliente1.getArticulo());
    }
}


