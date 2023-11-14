//Cecilia Jourdan 306329
//Enrique Rosa 290536

package Dominio;

import java.util.ArrayList;

public class Sistema  implements java.io.Serializable {
    public ArrayList<Evaluador> listaEvaluadores = new ArrayList<>();
    public ArrayList<Postulante> listaPostulante = new ArrayList<>();
    public ArrayList<Puestos> listaPuestos = new ArrayList<>();
    public ArrayList<Tematica> listaTematicas = new ArrayList<>();
    
    
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
    
   
     public void registrarTematica(Tematica unaTematica) {
        listaTematicas.add(unaTematica);
        
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
    
    
    
    
    
}
