import java.util.*;

public class exercicio 04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int consoantes = 0;
        char vetor[] = new char[10];
        char vetorconsoantes[] = new char[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %d° caractere: ", i + 1);
            vetor[i] = entrada.next().charAt(0);

            if (vetor[i] != 'a' && vetor[i] != 'e' && vetor[i] != 'i' && vetor[i] != 'o' && vetor[i] != 'u') {
                    vetorconsoantes[i] = vetor[i];
                    consoantes += 1;
            }
        }

        for (int i = 0; i < vetorconsoantes.length; i++) {
            if (vetorconsoantes[i] == 'a' || vetorconsoantes[i] == 'e' || vetorconsoantes[i] == 'i' || vetorconsoantes[i] == 'o' || vetorconsoantes[i] == 'u') {} else {
                System.out.println(vetorconsoantes[i]);
            }
        }
        System.out.printf("Existem %d consoantes", consoantes);
    }
}
