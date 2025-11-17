package articulos;

//Atributos
public class Articulo {
    private String titulo;
    private int anyoLanzamiento;
    private double precioPorDia;

    //Constructor vacío
    public Articulo() {
    }

    //Constructor completo
    public Articulo(String titulo, int anyoLanzamiento, double precioPorDia) {
        this.titulo = titulo;
        this.anyoLanzamiento = anyoLanzamiento;
        this.precioPorDia = precioPorDia;
    }

    //Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    public void setAnyoLanzamiento(int anyoLanzamiento) {
        this.anyoLanzamiento = anyoLanzamiento;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    //toString
    @Override
    public String toString() {
        return "Articulo{" +
                "titulo='" + titulo + '\'' +
                ", precioPorDia=" + precioPorDia +
                '}';
    }

}







