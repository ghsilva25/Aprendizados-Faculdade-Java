import java.util.*;

public class exercicio 05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetornumeronormal[] = new int[20];
        int vetorpar[] = new int[20];
        int vetorimpar[] = new int[20];

        for (int i = 0; i < vetornumeronormal.length; i++) {
            System.out.printf("Digite o %d° valor: ", i+1);
            vetornumeronormal[i] = entrada.nextInt();
            if (vetornumeronormal[i] % 2 == 0) {
                vetorpar[i] = vetornumeronormal[i];
            } else {
                vetorimpar[i] += vetornumeronormal[i];
            }
        }
        System.out.println("////////////////////////////////////");

        for (int i = 0; i < vetorpar.length; i++) {
            if (vetorpar[i] == 0) {} else {
                System.out.println("VETOR PAR: " +vetorpar[i]);
            }
        }
        System.out.println("////////////////////////////////////");

        for (int i = 0; i < vetorimpar.length; i++) {
            if (vetorimpar[i] == 0) {} else {
                System.out.println("VETOR ÍMPARES: " +vetorimpar[i]);
            }
        }
        System.out.println("////////////////////////////////////");

        for (int i = 0; i < vetornumeronormal.length; i++) {
            if (vetornumeronormal[i] == 0) {} else {
                System.out.println("VETOR NORMAL: " +vetornumeronormal[i]);
            }
        }
    }
}
