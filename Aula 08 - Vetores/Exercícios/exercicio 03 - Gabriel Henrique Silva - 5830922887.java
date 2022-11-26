import java.util.*;

public class exercicio 03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double acumulador = 0;
        double vetor[] = new double[4];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite a %d° nota: ", i+1);
            vetor[i] = entrada.nextDouble();
            acumulador += vetor[i];
        }
        System.out.println("A média do aluno é " +(acumulador / vetor.length));
    }
}
