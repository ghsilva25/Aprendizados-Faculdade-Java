package aula03;

import java.util.Scanner;

/**
 * *
 * @author Laís Gonçalves *
 * Programa calculo_do_volume_de_um_cilindro;  
var 	vAltura, vRaio, vVolume : Real; 
inicio 
	escreva(“Informe a altura da lata.”); 
  	leia(vAltura);
 	escreva(“Informe o raio da circunferência da lata.”); 
  	leia(vRaio); 
	vVolume := 3.14 * (vRaio * vRaio) * vAltura; 
	escreva(“O volume da lata é: ”, (vVolume)); 
 fim.
 */
public class Cilindro {
    public static void main(String[] args) {
        float vAltura, vRaio, vVolume;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a altura da lata:");
        vAltura = entrada.nextFloat();
        System.out.println("Informe o raio da circunferência da lata:");
        vRaio = entrada.nextFloat();
        vVolume =(float) (Math.PI *  Math.pow(vRaio, 2) * vAltura);
        System.out.println("O volume da lata é: " + vVolume + ".");
    }
}
