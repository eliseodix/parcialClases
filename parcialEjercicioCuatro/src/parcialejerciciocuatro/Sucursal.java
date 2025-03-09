
package parcialejerciciocuatro;

import java.util.ArrayList;

public class Sucursal {
    // Atributos
    private String numeroTelefono;
    private String direccion;
    private String codigoPostal;
    private String ciudad;
    private ArrayList<Empleado> empleados; 

    // Constructor
    public Sucursal(String numeroTelefono, String direccion, String codigoPostal, String ciudad) {
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.empleados = new ArrayList<>(); 
    }

   
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

   
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    
    @Override
    public String toString() {
        return "Ciudad: " + ciudad + 
               "\nDirección: " + direccion + 
               "\nTeléfono: " + numeroTelefono + 
               "\nCódigo Postal: " + codigoPostal + 
               "\nEmpleados: " + empleados.size();
    }
}



