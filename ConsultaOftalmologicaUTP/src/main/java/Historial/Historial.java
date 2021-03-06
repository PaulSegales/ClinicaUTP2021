package Historial;

import Persona.Medico;
import Persona.Paciente;

/**
 * @author 
 * Paul Quispe Segales 1626629
 * Jeremy Ccoyuri Apaza u19207272
 */
public class Historial{
    
    //ATRIBUTOS
    private String codHistoria;
    private Paciente paciente;
    private Medico medico;
    private String fecha;
    private String hora;
    private String diagnostico;
    private String receta;
    
    //CONSTRUCTORES
    public Historial() {
        this.codHistoria = "";
        this.paciente = null;
        this.medico = null;
        this.fecha = "";
        this.hora = "";
        this.diagnostico = "";
        this.receta = "";
    }

    public Historial(String codHistoria, Paciente paciente, Medico medico, String fecha, String hora, String diagnostico, String receta) {
        this.codHistoria = codHistoria;
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
        this.diagnostico = diagnostico;
        this.receta = receta;
    }
    
    //GETTER & SETTER
    public String getCodHistoria() {
        return codHistoria;
    }

    public void setCodHistoria(String codHistoria) {
        this.codHistoria = codHistoria;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }
   
}