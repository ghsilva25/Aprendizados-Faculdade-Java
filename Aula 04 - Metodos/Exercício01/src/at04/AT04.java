/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at04;
    import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class AT04 {

    public static void main(String[] args) {
        inserirdados (); 
    } 
    public static void inserirdados () {
        int hora, min;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a hora:");
        hora = entrada.nextInt();
        
        System.out.println("Informe os minutos:");
        min = entrada.nextInt();
        
        System.out.println("Se passaram " + calcular (hora,min));
        
    }
    
    public static int calcular(int hora, int min) {
        int resp = (hora * 60) + min;
        return resp;
        
    
}
}
