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
public class audio implements RepoductorMedia{

    @Override
    public void ejecutar() {
        System.out.println("Ejecutar desde la clase audio");
    }

    @Override
    public void detener() {
       System.out.println("Deteniendo desde la clase audio");
    }

    @Override
    public void rebobinar() {
       System.out.println("Rebobinando desde la clase audio");
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando desde la clase audio");
    }

    @Override
    public void grabar() {
        System.out.println("grabando desde la clase audio");
    }
    
}
