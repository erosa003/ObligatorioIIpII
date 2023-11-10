/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

public class Tematica {
    private String nombre;
    private String descripcion;
    
     public Tematica (String unNombre, String unaDescripcion ) {
        this.nombre = unNombre;
        this.descripcion = unaDescripcion;
   }
     
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
     public void setDescripcion(String unaDescripcion) {
        this.descripcion = unaDescripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    
}
