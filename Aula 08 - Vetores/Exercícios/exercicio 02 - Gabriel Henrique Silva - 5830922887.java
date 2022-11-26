import java.util.*;

public class exercicio 02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double vetor[] = new double[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %d valor: ", i+1);
            vetor[i] = entrada.nextInt();
        }

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
