
package parcialejerciciocuatro;


public class Organizacion extends Cliente{

 
    private String tipoOrganizacion;
    private String representante;
    private int cantidadEmpleados;

    public String getTipoOrganizacion() {
        return tipoOrganizacion;
    }

    public String getRepresentante() {
        return representante;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

   
    public Organizacion(String tipoOrganizacion, String representante, int cantidadEmpleados, String codigoIdentificacion, String nombre, String direccion) {
        super(codigoIdentificacion, nombre, direccion);
        this.tipoOrganizacion = tipoOrganizacion;
        this.representante = representante;
        this.cantidadEmpleados = cantidadEmpleados;
    }
    
    
    
}
