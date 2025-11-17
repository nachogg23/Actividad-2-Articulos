package usuarios; //Heredado de usuarios

import articulos.Articulo;

public class Administrador extends Usuario {
    private Rol rol;

    //Constructor vacio
    public Administrador() {}

    //Constructor completo
    public Administrador(String nombreUsuario, String contrasenya, int id, int anyoNacimiento) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.rol = rol;
    }

    //Getters y setters
    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }

    public void asignarArticulo(Cliente usuario, Articulo articulo) {
        usuario.setArticulo(articulo);
    }

    public void retirarArticulo(Cliente usuario) {
        usuario.setArticulo(null);
    }

    //toString
    @Override
    public String toString() {
        return "Administrador " + getNombreUsuario() + " (" + getId() + ")";
    }
}

