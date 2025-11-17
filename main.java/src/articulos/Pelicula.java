package articulos; //Heredado de articulos

//Atributos
public class Pelicula extends Articulo {
    private String director;
    private int duracion; // en minutos

    //Constructor vacio
    public Pelicula() {
    }

    //constructor completo
    public Pelicula(String titulo, int anyoLanzamiento, double precioPorDia, String director, int duracion) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.duracion = duracion;
    }

    //Getters y setters

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    //En este apartado hacemos que nos devuelva la duracion de la pelicula en segundos
    public int getDuracionSegundos() {
        return duracion * 60;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "director='" + director + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}




