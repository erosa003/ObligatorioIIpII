/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.ArrayList;


public class Puestos implements java.io.Serializable {
        private String nombre;
        private String tipo;
        private ArrayList<String> temasPuestos;
      
     
      public Puestos (String unNombre, String unTipo ) {
        this.nombre = unNombre;
        this.tipo = unTipo;
        this.temasPuestos = new ArrayList<>();
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
    
     public ArrayList<String> getTemasPuestos() {
        return temasPuestos;
    }
      public void setStockProductos(ArrayList<String> temasPuestos) {
        this.temasPuestos = temasPuestos;
    }
}
