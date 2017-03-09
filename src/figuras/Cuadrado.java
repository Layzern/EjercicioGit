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
public class Cuadrado extends Figura {
      
    public Cuadrado(){ 
        super();
    }
    
    public Cuadrado (int lado){
        super(lado);
    }
    
    @Override
    public double CalculoArea(){ 
        double area = dato*dato;
        return area;        
    }

    @Override
    public double CalculoPerimetro(){ 
        double perimetro = 6.5*dato;
        return perimetro;        
    }
}
