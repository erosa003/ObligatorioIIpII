//Cecilia Jourdan 306329
//Enrique Rosa 290536

package Dominio;

import java.util.List;

public class Postulante implements java.io.Serializable {
    private String nombre;
    private int cedula;
    private String direccion;
    private int telefono;
    private String mail;
    private String linkedin;
    private String formato;
    private List<String> experiencia;
    
     public Postulante (String unNombre, int unaCedula, String unaDireccion, int unTelefono,String unMail, String unLinkedin, String unFormato,List<String> unaExperiencia ) {
        this.nombre = unNombre;
        this.cedula = unaCedula;
        this.telefono = unTelefono;
        this.direccion = unaDireccion;
        this.mail = unMail;
        this.linkedin=unLinkedin;
        this.formato=unFormato;        
         this.experiencia = unaExperiencia;
   }
     public Postulante(){}
    
    
     public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
     public void setCedula(int unaCedula) {
        this.cedula = unaCedula;
    }
    
    public int getCedula(){
        return this.cedula;
    }
    
    
     public void setTelefono(int unTelefono){
        this.telefono = unTelefono;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
    
    
    public void setMail(String unMail){
        this.mail = unMail;
    }
    
    public String getMail(){
        return this.mail;
    }
    
     public void setDireccion(String unaDireccion){
        this.direccion = unaDireccion;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
     public void setLinkedin(String unLinkedin){
        this.linkedin = unLinkedin;
    }
    
    public String getLinkedin(){
        return this.linkedin;
    }
    
     public void setFormato(String unFormato) {
        this.formato = unFormato;
    }
    
    public String getFromato(){
        return this.formato;
    }
    
     public List<String> getExperiencia() {
        return experiencia;
    }
    
}
