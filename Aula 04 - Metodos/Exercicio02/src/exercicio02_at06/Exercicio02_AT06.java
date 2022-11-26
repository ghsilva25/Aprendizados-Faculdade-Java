/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02_at06;

import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class Exercicio02_AT06 {

    private static Scanner Scanner;

    public static void main(String[] args) {
        float largura, altura, profundidade, volume;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a largura da caixa em cm:");
        largura = entrada.nextFloat();
        
        System.out.println("Informe a altura da caixa em cm:");
        altura = entrada.nextFloat();
        
        System.out.println("Informe a profundidade da caixa em cm:");
        profundidade = entrada.nextFloat();
        
        volume = (altura*profundidade*largura)/100;
        
        System.out.println("O volume da caixa é: " + volume + "m³");
        
        
    }
    
}
