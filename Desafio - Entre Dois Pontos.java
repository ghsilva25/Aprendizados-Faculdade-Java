/*
Atividade a ser entregue na disciplina de Laboratório de Desenvolvimento de Algoritmos.

Desafio:
Contrua um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano:
P = (x1 - x2)
P = (y1 - y2)
Distância= Raiz (x2 - x1)² + (y1 - y2)²

 */
package atividade;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double d, x1, x2, y1, y2;
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe o valor de x1");
        x1= leitor.nextDouble();
        
        System.out.println("Informe o valor de x2");
        x2= leitor.nextDouble();
        
        System.out.println("Informe o valor de y1");
        y1= leitor.nextDouble();
        
        System.out.println("Informe o valor de y2");
        y2= leitor.nextDouble();
        
        d = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));        
        System.out.println("Distancia:" + d);
                
    }
    
}
