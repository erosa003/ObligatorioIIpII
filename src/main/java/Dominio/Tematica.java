//Cecilia Jourdan 306329
//Enrique Rosa 290536

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
