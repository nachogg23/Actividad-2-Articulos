package articulos; //Heredado de articulos

//Atributos
public class Libro extends Articulo {
    private String autor;
    private int numPaginas;
    private String genero;

    //Constructor vacio
    public Libro() {
    }

    //Constructor completo
    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numPaginas) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    //Getters y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Aqui hacemos que devuelva true si el libro tiene mas de 200 paginas
    public boolean esLargo() {
        return numPaginas > 200;
    }

    //toString
    @Override
    public String toString() {
        return "[Libro] " + getTitulo() + ", de " + autor + " (" + getPrecioPorDia() + " €/día)";
    }
}

