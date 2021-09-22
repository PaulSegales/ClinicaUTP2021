package Persona;

import Historial.Historial;

/**
 * @author 
 * Paul Quispe Segales 1626629
 * Jeremy Ccoyuri Apaza u19207272
 */
public class Paciente extends Persona {
    
    //ATRIBUTO
    Historial historial;
    
    //CONSTRUCTORES
    public Paciente() {
        super();
        this.historial = new Historial();
    }

    public Paciente(String codigo, String nombres, String apePaterno, String apeMaterno, int numDni, String email, String direccion, int telefono, String contraseña) {
        super(codigo, nombres, apePaterno, apeMaterno, numDni, email, direccion, telefono, contraseña);
        this.historial = new Historial();
    }
   
    //METODOS PUBLICOS
    public void Registrarse() {
        
    }
    public void GenerarCita() {       
    }

}