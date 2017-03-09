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
public class Rectangulo extends Figura{
    protected float dato2;
    public Rectangulo(){
        super();
        dato2 = dato/2;
    }
    public Rectangulo(float base,float altura){
        super(base);
        dato2 = altura;
    }
    @Override
    public double CalculoPerimetro(){ 
        double perimetro = 2*dato+2*dato2;
        return perimetro;        
    }
    @Override
    public double CalculoArea(){ 
        double area = dato*dato2;
        return area;        
    }
    @Override
    public void imprimirValorArea(){        
        System.out.println("rectangulo es: " + CalculoArea());        
    }
    @Override
    public void imprimirValorPerimetro(){        
        System.out.println("rectangulo es: " + CalculoArea());        
    }  
    public void imprimirDatos(){
        imprimirValorArea();
        imprimirValorPerimetro();
    }
    @Override
    public String toString(){
        String cadena = super.toString();
        //cadena=cadena.concat(String.valueOf(dato2));
        cadena = cadena + ";"+String.valueOf(dato2);
        return cadena;
    }
}
