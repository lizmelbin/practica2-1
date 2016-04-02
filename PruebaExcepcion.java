/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Liz Tejada
 */
public class PruebaExcepcion {
    
    
    public static  void disparandoExcepcion(int a, int b) throws MiExcepcion{
        
        if(a==0||b==0){
           
            throw new MiExcepcion("Valor igual a 0");
        }
        
    }
    
    public  static  void capturandoExcepcion(int a,int b){
        
        try{
            disparandoExcepcion(a,b);
        }catch(MiExcepcion e){
            System.err.println("Error del tipo mio "+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        capturandoExcepcion(0,8);
    }
}
