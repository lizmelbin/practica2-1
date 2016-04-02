/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Liz Tejada
 */
public class PruebaReproducible {
 
    
    public PruebaReproducible(){
        audio a= new audio();
        video v= new video();
        
      ArrayList lista=  new ArrayList<>();
     lista.add(v);
     lista.add(a);
        procesarRepoductoresMedia(lista);
    }
    
    
    
    public void procesarRepoductoresMedia ( List<RepoductorMedia> lista){
        
        for (RepoductorMedia r:lista) {
            
            r.avanzar();
            r.detener();
            r.ejecutar();
            r.grabar();
            r.rebobinar();
            
            
        }
        
    }
    
    
    
    public static void main(String[] args) {
        PruebaReproducible p = new PruebaReproducible();
        
        /**
         
         * LA ventaja de usar interfaces en este  tipo de problemas es que nos permite
         * especificar previamente caracteristicas (en este caso metodos) 
         * que un conjunto de clase deben tener en comun (aunque tengan comportamiento
         * distintos) 
         * ademas de que nos permite especificar mas de una interfaz por clase, 
         * lo cual no es el caso de cuando se usa herencia.
         */
        
    }
}
