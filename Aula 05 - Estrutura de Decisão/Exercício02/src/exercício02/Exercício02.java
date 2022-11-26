/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício02;

import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class Exercício02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tempoHora;
        float espacoKm, velocidade;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a distância do veículo em Km:");
        espacoKm = entrada.nextFloat();
        
        System.out.println("Informe o tempo em hora do veículo que percorrerá:");
        tempoHora = entrada.nextInt();
        
        velocidade = (espacoKm / tempoHora);
        
        if (espacoKm<0 && tempoHora<0) {
        System.out.println("Não calcular a velocidade!");    
            
        }   else {
            System.out.println("O calculo é:" + velocidade + "Km/h");
        }     
        
        
    }
    
}
