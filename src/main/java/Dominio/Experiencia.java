//Cecilia Jourdan 306329
//Enrique Rosa 290536

package Dominio;


public class Experiencia implements java.io.Serializable{
    private Tematica tematica;
    private int nivel;
    private Postulante postulante;
    
      public Experiencia (Tematica unaTematica, int nivel, Postulante unPostulante) {
        this.tematica = unaTematica;
        this.nivel = nivel;
        this.postulante=unPostulante;
    }
    
     public Tematica getTematica() {
        return tematica;
    }
     
    public Postulante getPostulante() {
        return postulante;
    }
     
     public int getNivel() {
        return nivel;
    }
       public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
     public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }
     
     public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }
}
