/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;
    public class Evaluador implements java.io.Serializable {
    private String nombre;
    private int cedula;
    private int añodeingreso;
    private String direccion;

    public Evaluador (String unNombre, int unaCedula, int unAñoDeIngreso, String unaDireccion) {
        this.nombre = unNombre;
        this.cedula = unaCedula;
        this.añodeingreso = unAñoDeIngreso;
        this.direccion = unaDireccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public int getAñoDeIngreso() {
        return añodeingreso;
    }
    
     public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setAñoDeIngreso(int añoDeIngreso) {
        this.añodeingreso = añoDeIngreso;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

