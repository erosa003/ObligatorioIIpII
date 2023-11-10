/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;
//prueba de cambio
    public class Evaluador implements java.io.Serializable {
    private String nombre;
    private String cedula;
    private String añodeingreso;
    private String direccion;

    public Evaluador (String unNombre, String unaCedula, String unAñoDeIngreso, String unaDireccion) {
        this.nombre = unNombre;
        this.cedula = unaCedula;
        this.añodeingreso = unAñoDeIngreso;
        this.direccion = unaDireccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getAñoDeIngreso() {
        return añodeingreso;
    }
    
     public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setAñoDeIngreso(String añoDeIngreso) {
        this.añodeingreso = añoDeIngreso;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

