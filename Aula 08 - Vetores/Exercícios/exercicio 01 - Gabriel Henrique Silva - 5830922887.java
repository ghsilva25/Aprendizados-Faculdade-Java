// Exercício que entre 5 números inteiros dentro do vetor.

import java.util.Scanner;

public class exercício 01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[5]; // Recebe a quantidade de números inteiros dentro dos colchetes.

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %d valor: \n", i+1); // Imprime a mensagem para o suposto valor!
            vetor[i] = entrada.nextInt(); // Recebe
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
