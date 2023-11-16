//Cecilia Jourdan 306329
//Enrique Rosa 290536

package Dominio;


public class Experiencia implements java.io.Serializable{
    private Tematica tematica;
    private int nivel;
    
      public Experiencia (Tematica unaTematica, int nivel) {
        this.tematica = unaTematica;
        this.nivel = nivel;
        
    }
    
     public Tematica getTematica() {
        return tematica;
    }
     
     public int getNivel() {
        return nivel;
    }
       public void setNivel(int nivel) {
        this.nivel = nivel;
    }
     
     public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }
}
