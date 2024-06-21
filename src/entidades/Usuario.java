
package entidades;


public class Usuario {
    //variables de clase de la tabla usuario de mi BD
    private int idusuario;
    private int rol_id;
    private String nombre;
    private String tipo_documento;
    private String num_documento;
    private String direccion;
    private String celular;
    private String email;
    private String clave;
    private boolean estado;
    
    //constructor vacio
    public Usuario() {
    }
    
    //constructor con sus parametros
    public Usuario(int idusuario, int rol_id, String nombre, String tipo_documento, String num_documento, String direccion, String celular, String email, String clave, boolean estado) {
        this.idusuario = idusuario;
        this.rol_id = rol_id;
        this.nombre = nombre;
        this.tipo_documento = tipo_documento;
        this.num_documento = num_documento;
        this.direccion = direccion;
        this.celular = celular;
        this.email = email;
        this.clave = clave;
        this.estado = estado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idusuario=" + idusuario + ", rol_id=" + rol_id + ", nombre=" + nombre + ", tipo_documento=" + tipo_documento + ", num_documento=" + num_documento + ", direccion=" + direccion + ", celular=" + celular + ", email=" + email + ", clave=" + clave + ", estado=" + estado + '}';
    }
    
            
}
