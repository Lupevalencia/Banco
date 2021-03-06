
package mx.com.gm.banco.domain;


public class Clientes {
    String dni;
    String nombre;
    String apellidos;
    String direcccion;
    String telefono;
    
    //constructores

    public Clientes() {
    }

    public Clientes(String dni, String nombre, String apellidos, String direcccion, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direcccion = direcccion;
        this.telefono = telefono;
    }
   
    //métodos

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDirecccion() {
        return this.direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //toString

    @Override
    public String toString() {
        return "Clientes{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direcccion=" + direcccion + ", telefono=" + telefono + '}';
    }
    
}
