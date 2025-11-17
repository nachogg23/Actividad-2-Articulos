package articulos; //Heredado de articulos

//Atributos
public class AlbumMusica extends Articulo {
    private String autor;
    private int numCanciones;
    private boolean single;

    //Constructor vacio
    public AlbumMusica() {
    }

    //Constructor completo
    public AlbumMusica(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numCanciones, boolean single) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numCanciones = numCanciones;
        this.single = single;
    }

    //Getters y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public boolean getSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    //toString
    @Override
    public String toString() {
        return "AlbumMusica{" +
                "autor='" + autor + '\'' +
                ", numCanciones=" + numCanciones +
                ", single=" + single +
                '}';
    }
}

