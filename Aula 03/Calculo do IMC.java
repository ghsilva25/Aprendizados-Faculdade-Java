package aula03;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula03 {
    public static void main(String[] args) {
        float peso, estatura, imc;
        String nome="";
        char sexo =' ';
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome= entrada.next();
        System.out.println("Digite seu sexo masculino ou feminino");
        sexo= entrada.next().charAt(0);
        System.out.println("Digite o peso (em Kg):");
        peso= entrada.nextFloat();
        System.out.println("Digite a estatura (em m):");
        estatura= entrada.nextFloat();    
        imc = peso / (float)Math.pow(estatura, 2);
        System.out.println(nome+" o seu IMC é: " + imc +
                                " Kg/m² e \n você é sexo "+sexo );
    }    
}
