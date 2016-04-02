/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Liz Tejada
 */
public class PruebaColecciones {
    
    
    public static void main(String[] args) {
        MiColeccion miColeccion =new MiColeccion(3);
        ArrayList arrayList=new ArrayList();
        LinkedList  linkedList=new LinkedList();
       
        miColeccion.add(2);
        miColeccion.add("Liz");
        miColeccion.add("Melbin");
        miColeccion.add("Tejada");
       
        recorrerLista(miColeccion);
        arrayList.add("lourdes");
        arrayList.add("Nairobi");
        arrayList.add("Fernandez");
        recorrerLista(arrayList);
        linkedList.add("Alcida ");
        linkedList.add("Almonte ");
        linkedList.add("Lopez");
        
        recorrerLista(linkedList);
    }
    public static void recorrerLista(java.util.List lista){
        
        
        System.out.println("Cantidad de elementos "+lista.size()
                +"\nLos diferentes tipos de elementos"
        );
        for (Object temp:lista.toArray()) {
            
            if(temp!=null)
                System.out.println(temp.getClass().getName());
            else{
                System.out.println("null");
            }
        }
    
    
        System.out.println("\n");
    }
}
