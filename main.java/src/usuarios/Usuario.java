package usuarios; //Heredado de usuarios

public class Usuario {
    private String nombreUsuario;
    private String contrasenya;
    private int id;
    private int anyoNacimiento;

    //Constructor vacio
    public Usuario() {}

    //Constructor completo
    public Usuario(String nombreUsuario, String contrasenya, int id, int anyoNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.id = id;
        this.anyoNacimiento = anyoNacimiento;
    }

    //Getters y setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    public boolean contrasenyaSegura() {
        return contrasenya != null && contrasenya.length() > 10;
    }
//toString
    @Override
    public String toString() {
        return nombreUsuario + " (" + id + ")";
    }
}

