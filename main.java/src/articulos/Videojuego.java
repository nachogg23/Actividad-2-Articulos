package articulos; //Heredado de articulos

public class Videojuego extends Articulo {
    private String director;
    private String plataformas;
    private int pegi;

    //Constructor vacio
    public Videojuego() {}

    //Constructor completo
    public Videojuego(String titulo, int anyoLanzamiento, double precioPorDia, String director, String plataformas, int pegi) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.plataformas = plataformas;
        this.pegi = pegi;
    }

    //Getters y setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public boolean esApto(int edad) {
        return edad >= pegi;
    }
//toString
    @Override
    public String toString() {
        return "[Videojuego] " + getTitulo() + ", de " + director + " (" + getPrecioPorDia() + " €/día)";
    }
}
