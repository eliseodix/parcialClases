
package parcialejerciciocuatro;


public class PersonaFisica extends Cliente{

    public String getFechaNacimineto() {
        return fechaNacimineto;
    }

    public String getSexo() {
        return sexo;
    }

    
    private String  fechaNacimineto;
    private String sexo;

    public PersonaFisica(String fechaNacimineto, String sexo, String codigoIdentificacion, String nombre, String direccion) {
        super(codigoIdentificacion, nombre, direccion);
        this.fechaNacimineto = fechaNacimineto;
        this.sexo = sexo;
    }
    
   
       
}
