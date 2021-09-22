package Persona;

/**
 * @author 
 * Paul Quispe Segales 1626629
 * Jeremy Ccoyuri Apaza u19207272
 */
public class Medico extends Persona {
    
    //CONSTRUCTORES
    public Medico() {
        super();
    }
    
    public Medico(String codigo, String nombres, String apePaterno, String apeMaterno, int numDni, String email, String direccion, int telefono, String contraseña) {
        super(codigo,nombres,apePaterno,apeMaterno,numDni,email,direccion,telefono,contraseña);
    }
    
    //METODOS PUBLICOS
    public void SeleccionarDia(){
    }
    public void EligirCita() {
    }
    public void MostrarHistorial() {
    }
    public void NuevaHistoria() {       
    }
    public void GenerarPdf() {
    }

}