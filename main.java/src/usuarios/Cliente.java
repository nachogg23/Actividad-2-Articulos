package usuarios; //Heredado de usuarios

import articulos.Articulo;

public class Cliente extends Usuario {

    private Articulo articulo;
    private int numSocio;

    //Constructor vacio
    public Cliente() {}

    //Constructor completo
    public Cliente(String nombreUsuario, String contrasenya, int id, int anyoNacimiento,
                   Articulo articulo, int numSocio) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.articulo = articulo;
        this.numSocio = numSocio;
    }

    //Getters y setters
    public Articulo getArticulo() { return articulo; }
    public void setArticulo(Articulo articulo) { this.articulo = articulo; }

    public int getNumSocio() { return numSocio; }
    public void setNumSocio(int numSocio) { this.numSocio = numSocio; }


    //toString
    @Override
    public String toString() {
        return "Cliente{" +
                "articulo=" + articulo +
                ", numSocio=" + numSocio +
                '}';
    }
}







