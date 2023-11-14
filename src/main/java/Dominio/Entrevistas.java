/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;


public class Entrevistas implements java.io.Serializable  {
       
    private Evaluador evaluador;
    private Postulante postulante;
    private int puntaje;
    private String comentario;

    public Entrevistas (Evaluador unEvaluador, Postulante unPostulante, int puntaje, String unComentario) {
        this.evaluador = unEvaluador;
        this.postulante = unPostulante;
        this.puntaje = puntaje;
        this.comentario = unComentario;
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
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}



