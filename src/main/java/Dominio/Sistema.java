//Cecilia Jourdan 306329
//Enrique Rosa 290536

package Dominio;

import java.util.ArrayList;

public class Sistema implements java.io.Serializable {
    public ArrayList<Evaluador> listaEvaluadores = new ArrayList<>();
    public ArrayList<Postulante> listaPostulante = new ArrayList<>();
    public ArrayList<Puestos> listaPuestos = new ArrayList<>();
    public ArrayList<Tematica> listaTematicas = new ArrayList<>();
     public ArrayList<Entrevistas> listaEntrevistas = new ArrayList<>();
    
    
    public ArrayList<Evaluador> getlistaEvaluadores() {
        return listaEvaluadores;
    }
    
    public ArrayList<Puestos> getListaPuestos() {
        return listaPuestos;
    }
    
    public ArrayList<Postulante> getlistaPostulante(){
        return listaPostulante;
    }
    
    public ArrayList<Tematica> getlistaTematicas(){
        return listaTematicas;
    }
    
     public ArrayList<Entrevistas> getlistaEntrevistas(){
        return listaEntrevistas;
    }
   
     public void registrarTematica(Tematica unaTematica) {
        listaTematicas.add(unaTematica);
    }
     
     public void registrarEntrevista(Entrevistas unaEntrevista) {
        listaEntrevistas.add(unaEntrevista); 
    }
    
    public void registrarPuesto(Puestos unPuesto) {
        listaPuestos.add(unPuesto);
    }
    
     public void registrarPostulantes(Postulante unPostulante) {
        listaPostulante.add(unPostulante);
        
    }
    
    public void registrarEvaluadores(Evaluador unEvaluador) {
        listaEvaluadores.add(unEvaluador);
    }
    
    //public void nivelMayorA5(listaTematica){
        //contador=0;
       // for(int i = 0 ; i< listaPostulante.size(); i++ ){
        //   if()
        
      //    
    
    public Evaluador findEvaluador(String nombreEvaluador){
       Evaluador evaluador = new Evaluador(); 
               
       for(Evaluador e : this.listaEvaluadores){
           if(nombreEvaluador.equalsIgnoreCase(e.getNombre())){
               evaluador = e;
           }
       }
       return evaluador;
    }
     public Postulante findPostulante(String nombrePostulante){
       Postulante postulante = new Postulante(); 
               
       for(Postulante p : this.listaPostulante){
           if(nombrePostulante.equalsIgnoreCase(p.getNombre())){
               postulante = p;
           }
       }
       return postulante;
    }
}