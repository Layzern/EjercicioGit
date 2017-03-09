/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Adriana
 */
public class Circulo extends Figura{
    
    public Circulo(){
        super();
    }
    
    public Circulo(float dato){
        super(dato);
    }

    
    @Override
    public double CalculoArea(){ 
        double area = Math.PI*(Math.pow(dato, 2));
        return area;        
    }

    @Override
    public double CalculoPerimetro(){ 
        double perimetro = 2*Math.PI*dato;
        return perimetro;        
    }
    @Override
    public void imprimirValorArea(){        
        System.out.println("circulo es: " + CalculoArea());        
    }
    @Override
    public void imprimirValorPerimetro(){        
        System.out.println("circulo es: " + CalculoArea());        
    }  
    public void imprimirDatos(){
        imprimirValorArea();
        imprimirValorPerimetro();
    }
    @Override
    public String toString(){
        String cadena = String.valueOf(dato);
        return cadena;
    }
}
