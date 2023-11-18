//Cecilia Jourdan 306329
//Enrique Rosa 290536

package Dominio;

import java.util.ArrayList;
import java.util.Observable;

public class Sistema extends Observable implements java.io.Serializable {
    public ArrayList<Evaluador> listaEvaluadores = new ArrayList<>();
    public ArrayList<Postulante> listaPostulante = new ArrayList<>();
    public ArrayList<Puestos> listaPuestos = new ArrayList<>();
    public ArrayList<Tematica> listaTematicas = new ArrayList<>();
    public ArrayList<Entrevistas> listaEntrevistas = new ArrayList<>();
    public ArrayList<Experiencia> listaExperiencia = new ArrayList<>();
    
    
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
      public ArrayList<Experiencia> getlistaExpereincia(){
        return listaExperiencia;
    }
      
    public void registrarExperiencia(Experiencia unaExperienica) {
        listaExperiencia.add(unaExperienica);
        setChanged();
        notifyObservers();
    }
   
     public void registrarTematica(Tematica unaTematica) {
        listaTematicas.add(unaTematica);
        setChanged();
        notifyObservers();
    }
     
     public void registrarEntrevista(Entrevistas unaEntrevista) {
        listaEntrevistas.add(unaEntrevista);
        setChanged();
        notifyObservers();
    }
    
    public void registrarPuesto(Puestos unPuesto) {
        listaPuestos.add(unPuesto);
        setChanged();
        notifyObservers();
    }
    
     public void registrarPostulantes(Postulante unPostulante) {
        listaPostulante.add(unPostulante);
        setChanged();
        notifyObservers();
        
    }
    
    public void registrarEvaluadores(Evaluador unEvaluador) {
        listaEvaluadores.add(unEvaluador);
        setChanged();
        notifyObservers();
    } 
    
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
     
     
      public Tematica findTematica(String nombreTematica){
       Tematica tematica = new Tematica(); 
               
       for(Tematica t : this.listaTematicas){
           if(nombreTematica.equalsIgnoreCase(t.getNombre())){
               tematica = t;
           }
       }
       return tematica;
    }
    
     public int nivelMayorA5(String nombreTem){
        int contador = 0;
        for(Postulante p: this.getlistaPostulante()){
         for(Experiencia e : this.getlistaExpereincia()){
            
            if(e.getTematica().getNombre().equals(nombreTem)){
                 
                if(e.getNivel() > 5){
                     contador++;
                 }
             }
         
         }
        
        }
        return contador;
     }
     
     
     public int cantPuestos(String nombreTem){
        int contador = 0;
        for(Puestos p : this.getListaPuestos()){
            
         for(Experiencia e : this.getlistaExpereincia()){
            Tematica t = this.findTematica(nombreTem);
            if(e.getTematica().getNombre().equals(nombreTem)){
                
                if(p.getTemasRequeridos().contains(t)){
                     contador++;
                 }
             }
         }
        }
        return contador;
     }
}
