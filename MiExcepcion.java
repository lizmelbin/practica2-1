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
public class MiExcepcion extends Exception{
    public MiExcepcion(){
        super();
    }
    public MiExcepcion(String nombre){
        super(nombre);
    }
}
