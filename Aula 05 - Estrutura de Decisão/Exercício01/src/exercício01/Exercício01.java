/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício01;

import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class Exercício01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a, b, c, x1, x2, delta;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o valor de a:");
        a = entrada.nextInt();
        
        System.out.println("Informe o valor de b:");
        b = entrada.nextInt();
        
        System.out.println("Informe o valor de c:");
        c = entrada.nextInt();
       
        delta = (b*b) - (4*a*c);
        
        if (delta<0)
        System.out.println("Não calculo raizes negativas!");
        
        else { 
            x1 = (int)((-b + Math.sqrt(delta)) / (2*a));
            x2 = (int)((-b - Math.sqrt(delta)) / (2*a));        
            
            System.out.println("Seu calulo é:" + x1 + x2);
            
                }
    }
    
}
