/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Puestos implements java.io.Serializable {
        private String nombre;
        private String tipo;
       // private ArrayList<String> temasPuestos;
       List<Tematica> TemasRequeridos;
     
      public Puestos (String unNombre, String unTipo, List<Tematica> temasReq) {
        this.nombre = unNombre;
        this.tipo = unTipo;
         this.TemasRequeridos = temasReq;
        //this.temasPuestos = new ArrayList<>();
    }
     
     public String getNombre() {
        return nombre;
    }
     
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    public String getTipo() {
        return tipo;
    }
        public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
   //  public ArrayList<String> getTemasPuestos() {
     //   return temasPuestos;
   // }
     // public void setStockProductos(ArrayList<String> temasPuestos) {
       // this.temasPuestos = temasPuestos;
   // }
        public List<Tematica> getTemasRequeridos() {
        return TemasRequeridos;
    }
        

    
}
