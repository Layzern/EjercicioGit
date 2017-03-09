/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author gema
 */
public class Figura {
    protected float dato;
    
    
    public Figura(){
        dato = 5;
    }
    
    public Figura(float dato){
        this.dato = dato;
    }

    public float getDato(){
        return dato;
    }

    public void setDato(float dato){
        this.dato = dato;
    }
    
    public double CalculoArea(){ 
        return 0;
    }
    
    public double CalculoPerimetro(){ 
        return 0;
    }
    
    public void imprimirValorArea(){
        String name = getClass().getName().toLowerCase();
        name = name.substring(8, name.length());
        System.out.println("El area del "+name+" es: " + CalculoArea());        
    }
    
   
    public void imprimirValorPerimetro(){
        String name = getClass().getName().toLowerCase();
        name = name.substring(8, name.length());
        System.out.println("El valor del perimetro del "+name+ " es:" + CalculoPerimetro());        
    }  
      
    
    @Override
    public String toString(){
        String cadena = String.valueOf(dato);
        return cadena;
    }
}
