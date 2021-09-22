package Persona;

/**
 * @author 
 * Paul Quispe Segales 1626629
 * Jeremy Ccoyuri Apaza u19207272
 */
public class Administrador extends Persona {
    
    //CONSTRUCTORES
    public Administrador(){
        super();
    }
    public Administrador(String codigo, String nombres, String apePaterno, String apeMaterno, int numDni, String email, String direccion, int telefono, String contraseña) {
        super(codigo,nombres,apeMaterno,apeMaterno,numDni,email,direccion,telefono,contraseña);
    }
    
    //METODOS PUBLICOS
    public void BuscarPaciente() {
    }
    public void BuscarMedico() {
    }
    public void BuscarCita() {
    }
    public void InsertarPaciente() {      
    }
    public void InsertarMedico() {       
    }
    public void InsertarCita() {       
    }
    public void ModificarPaciente() {
    }
    public void ModificarMedico() {
    }
    public void ModificarCita() {       
    }
    public void EliminarPaciente() {        
    }
    public void EliminarMedico() {        
    }
    public void EliminarCita() {        
    }
}