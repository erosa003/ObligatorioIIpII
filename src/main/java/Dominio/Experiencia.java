
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
       public void setTematica(int nivel) {
        this.nivel = nivel;
    }
     
   // public void setComentario(String comentario) {
     //   this.comentario = comentario;
    //}
}
