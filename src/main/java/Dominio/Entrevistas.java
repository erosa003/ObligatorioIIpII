//Cecilia Jourdan 306329
//Enrique Rosa 290536

package Dominio;


public class Entrevistas implements java.io.Serializable  {
       
    private Evaluador evaluador;
    private Postulante postulante;
    private int puntaje;
    private String comentario;
    private int indicePostulante;

    public Entrevistas (Evaluador unEvaluador, Postulante unPostulante, int puntaje, String unComentario, int indice) {
        this.evaluador = unEvaluador;
        this.postulante = unPostulante;
        this.puntaje = puntaje;
        this.comentario = unComentario;
        this.indicePostulante = indice;
        
    }

    public Evaluador getEvaluador() {
        return evaluador;
    }

    public Postulante getPostulante() {
        return postulante;
    }

    public int getPuntaje() {
        return puntaje;
    }
     public int getIndicePostulante() {
        return indicePostulante;
    }
    
     public String getComentario() {
        return comentario;
    }

    public void setEvaluador(Evaluador evaluador) {
        this.evaluador = evaluador;
    }

    public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
     public void setIndicePostulante(int indicePostulante) {
        this.indicePostulante = indicePostulante;
    }
     
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}



