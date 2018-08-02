/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, opc, c;
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Digite un numero");
        num1= lector.nextInt();
        
        System.out.println("Digite otro numero");
        num2= lector.nextInt();
        
        System.out.println("1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir");
        opc= lector.nextInt();
        
        switch(opc){
            case 1:
                 c=num1+num2;
                 System.out.println("Resultado"+c);
            case 2:
                 c=num1-num2;
                 System.out.println("Resultado"+c);
            case 3:
                 c=num1*num2;
                 System.out.println("Resultado"+c);
            case 4:
                 c=num1/num2;
                 System.out.println("Resultado"+c);
                 
                
        }
            
                
        

    }
    
}
