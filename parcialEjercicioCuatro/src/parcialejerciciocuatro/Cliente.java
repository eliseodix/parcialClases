
package parcialejerciciocuatro;


public class Cliente {
    private String codigoIdentificacion;
    private String nombre;
    private String direccion;

    public String getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public void setCodigoIdentificacion(String codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente(String codigoIdentificacion, String nombre, String direccion) {
        this.codigoIdentificacion = codigoIdentificacion;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    
    
}
