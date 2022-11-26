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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String produto;
        int parcelas, pagamento;
        float preço;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println ("Informe o preço do produto desejado:");
        preço = entrada.nextFloat();
        
        System.out.println ("Informe a quantidade de parcelas:");
        parcelas = entrada.nextInt();
        
        if (parcelas<=3)
        System.out.println ("Deverá ter um acréscimo de 10%."); 
        
         
        
        
    }
    
}
