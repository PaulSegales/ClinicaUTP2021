package Persona;

/**
 * @author 
 * Paul Quispe Segales 1626629
 * Jeremy Ccoyuri Apaza u19207272
 */
public class Persona {
    
    //ATRIBUTOS
    private String codigo;
    private String nombres;
    private String apePaterno;
    private String apeMaterno;
    private int numDni;
    private String email;
    private String direccion;
    private int telefono;
    private String contraseña;
    
    //CONSTRUCTORES
    public Persona() {
        this.codigo = "";
        this.nombres = "";
        this.apePaterno = "";
        this.apeMaterno = "";
        this.numDni = 0;
        this.email = "";
        this.direccion = "";
        this.telefono = 0;
        this.contraseña = "";
    }

    public Persona(String codigo, String nombres, String apePaterno, String apeMaterno, int numDni, String email, String direccion, int telefono, String contraseña) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.numDni = numDni;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contraseña = contraseña;
    }
    
    //GETTER & SETTER

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public int getNumDni() {
        return numDni;
    }

    public void setNumDni(int numDni) {
        this.numDni = numDni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    //METODOS PÚBLICOS  
    public void IniciarSesion() {
               
    }
    public void CerrarSesion() {

    }
    

}