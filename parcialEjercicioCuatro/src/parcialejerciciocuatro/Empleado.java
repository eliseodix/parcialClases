
package parcialejerciciocuatro;


import javax.swing.*;
import java.util.*;


class Empleado {
    private String dni;
    private String fechaNacimiento;
    private String sexo;
    private String nombre;
    private String direccion;

    public Empleado(String dni, String fechaNacimiento, String sexo, String nombre, String direccion) {
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Empleado [DNI=" + dni + ", Fecha de Nacimiento=" + fechaNacimiento + ", Sexo=" + sexo +
               ", Nombre=" + nombre + ", Dirección=" + direccion + "]";
    
    }
   
    
    
}
