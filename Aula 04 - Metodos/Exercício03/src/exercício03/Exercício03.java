/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício03;

import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class Exercício03 {

    public static void main(String[] args) {
        
        char operador;
        int valorA, valorB;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o primeiro valor:");
        valorA = entrada.nextInt();
        
        System.out.println("Informe o segundo valor:");
        valorB = entrada.nextInt();
        
        System.out.println("Informe a operação:");
        operador = entrada.next().charAt(0);
        
        if (operador == '+') {
            
            System.out.print("A soma é: " + (valorA + valorB));       
        
        } else if (operador == '-') {
            System.out.println("A subtração é: " + (valorA - valorB));
        
        } else if (operador == '*') {
            System.out.println("A multiplicação é: " + (valorA*valorB));
        
        } else if (operador == '/') {
            System.out.println("A divisão é: " + (valorA/valorB));
        } 
    }
}


    
            


