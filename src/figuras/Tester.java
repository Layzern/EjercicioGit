/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author Adriana
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Figura lista[] = new Figura[8];
        int opcion;
        Scanner lector = new Scanner (System.in);
        
        do{
            System.out.println("Seleccione una opcion:\n1. Ver cuadrado\n2. Ver circulo\n3. Ver triangulo\n4. Ver rectangulo\n5. Crear cuadrado\n6. Crear circulo\n7. Crear triangulo\n8. Crear rectangulo\n9. Mostrar array\n10. Salir");
            opcion = lector.nextInt();
            if(opcion==1){
                lista[opcion-1] =new Cuadrado();
                System.out.println(lista[opcion-1].toString());
            }else if(opcion==2){
                lista[opcion-1] =new Circulo();
                System.out.println(lista[opcion-1].toString());
            }else if(opcion==3){
                lista[opcion-1] = new Triangulo();
                System.out.println(lista[opcion-1].toString());
            }else if(opcion==4){
                lista[opcion-1] = new Rectangulo();
                System.out.println(lista[opcion-1].toString());
            }else if(opcion==5){
                System.out.println("Introduzca el tamaño del lado:");
                int lado = lector.nextInt();
                lista[opcion-1] = new Cuadrado(lado);
                System.out.println(lista[opcion-1].toString());
            }else if(opcion==6){
                System.out.println("Introduzca el tamaño del radio:");
                int radio = lector.nextInt();
                lista[opcion-1] = new Circulo(radio);
                System.out.println(lista[opcion-1].toString());
            }else if(opcion==7){
                System.out.println("Introduzca el tamaño del lado:");
                int lado = lector.nextInt();
                lista[opcion-1] = new Triangulo(lado);
                System.out.println(lista[opcion-1].toString());
            }else if(opcion==8){
                System.out.println("Introduzca el lado1 y el lado2:");
                int lado1 = lector.nextInt();
                int lado2 = lector.nextInt();
                lista[opcion-1] = new Rectangulo(lado1, lado2);
                System.out.println(lista[opcion-1].toString());
            }else if(opcion==9){
              
                for (int i = 0; i < lista.length; i++) {
                    if (lista[i]!=null){
                        System.out.print(lista[i].toString());
                        System.out.print(lista[i].CalculoPerimetro()+";");
                        System.out.print(lista[i].CalculoArea()+";");
                        System.out.println();
                    }
                    else
                        System.out.println("vacio");
                }
            }else if(opcion==10){
                System.out.println("El programa ha terminado");
            }
        }while(opcion!=10);
    }
    
}
