/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão02aula06;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Questão02Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Qnumero, cont = 1;
        float valor = 0, qtdeSoma = 0, media, maior = 0;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o grupo de valores: ");
        Qnumero = entrada.nextInt();
        
        while(cont<=Qnumero){
            System.out.println("Insira o valor: " + cont);
            valor = entrada.nextFloat();
            
            qtdeSoma+=valor;
            cont++;
            
        }
        
        if (maior<valor){
            maior = valor;
        }
        
        media = qtdeSoma / Qnumero;
        System.out.println("Sua média é: "+media);
        System.out.println("O maior valor digitado é: "+valor);
 
    }
}
