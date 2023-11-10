/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

public class Postulante {
    private String nombre;
    private int cedula;
    private String direccion;
    private int telefono;
    private String mail;
    private String linkedin;
    private String formato;
    
     public Postulante (String unNombre, int unaCedula, String unaDireccion, int unTelefono,String unMail, String unLinkedin, String unFormato ) {
        this.nombre = unNombre;
        this.cedula = unaCedula;
        this.telefono = unTelefono;
        this.direccion = unaDireccion;
        this.mail = unMail;
        this.linkedin=unLinkedin;
        this.formato=unFormato;        
   }
    
    
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
    
    
}
