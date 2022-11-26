/*
 Exercício 03:

Escreva um algoritmo (e programe-o na linguagem java) que leia um grupo de valores 
reais e determine quantos valores são positivos e quantos são negativos. Determine também qual é o menor desses valores. 
Utilize o comando de repetição que deseje.

// ESTUDOS GABRIEL
 */
package ex01_aula06;

import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class Ex01_Aula06 {

    public static void main(String[] args) {
        int num1, positivos = 0, negativos = 0, menorNum = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o primeiro número:");
            num1 = entrada.nextInt();

            if (num1 >= 0) {
                positivos++;
            } else {
                negativos++;

            } if (menorNum == 0 || menorNum > num1){
                menorNum = num1;
               
                
                
            }
        } 
        System.out.println("Esses foram os valores positivos :" + positivos);
        System.out.println("Esses foram os valores negativos: " + negativos);
        System.out.println("O menor número é:" + menorNum);

    }

}
