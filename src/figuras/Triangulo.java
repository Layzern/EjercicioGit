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
public class Triangulo extends Figura{
    
    public Triangulo(){
        super();
    }
    
    public Triangulo(int dato){
        super(dato);
    }
    
    @Override
    public double CalculoPerimetro(){ 
        double perimetro = 4.5*dato;
        return perimetro;        
    }
    @Override
    public double CalculoArea(){ 
        double p = CalculoPerimetro()/2;
        double area = Math.sqrt(p*Math.pow((p-dato),3));
        return area;        
    }
    
    @Override
    public void imprimirValorArea(){        
          super.imprimirValorArea();
          System.out.println("del Triangulo: "+CalculoArea());
    }
}
