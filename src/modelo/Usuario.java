package modelo;

/**
 * @author andresramirezamaya
 */
public class Usuario {

    private int idUsuario;
    private String nombre;
    private String email;
    private String clave;
    private int tipoUsuario;
    private int areas;
    private int estado;

    public Usuario() {

    }

    // constructor para agregar
    public Usuario(String nombre, String email, String clave, int tipoUsuario, int areas, int estado) {
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
        this.tipoUsuario = tipoUsuario;
        this.areas = areas;
        this.estado = estado;
    }

    //constructor para actualizar
    public Usuario(int idUsuario, String nombre, String email, String clave, int tipoUsuario, int areas, int estado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
        this.tipoUsuario = tipoUsuario;
        this.areas = areas;
        this.estado = estado;
    }

    // getter - setter
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getAreas() {
        return areas;
    }

    public void setAreas(int areas) {
        this.areas = areas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    //fin clase producto
}
