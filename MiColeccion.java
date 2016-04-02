/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Liz Tejada
 */
public class MiColeccion implements java.util.List{

    
    Object []myData;
    
    public MiColeccion(){
        myData= new Object[3];
        
    }
     public MiColeccion(int dimension){
        myData= new Object[dimension];
        
    }
    
    
    @Override
    public int size() {
        
        int size=0;
        
        for (Object temp:myData) {
            if(temp!=null){
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
       for (Object temp:myData) {
                
                if(temp!=null){
                   return false;
                    
                }
                
            }
       return  true;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        return myData;
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Object e) {
        try{
            
        
            
            int firstNullPosition=myData.length;
            int pos=0;
            for (Object temp:myData) {
                
                if(temp==null){
                    firstNullPosition=pos;
                    break;
                }
                pos++;
            }
            
            if(firstNullPosition==myData.length){
                return false;
            }
            
           myData[firstNullPosition]=e;
        }catch(Exception e1){
            return false;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
       for (Object temp:myData) {
                
               temp=null;
            }
    }

    @Override
    public Object get(int index) {
       try{
           return myData[index];
       }catch(Exception e){
           throw  new IndexOutOfBoundsException();
       }
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object remove(int index) {
       try{
           myData[index]=null;
        }catch(Exception e1){
           throw  new IndexOutOfBoundsException();
        }
        return true;
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
