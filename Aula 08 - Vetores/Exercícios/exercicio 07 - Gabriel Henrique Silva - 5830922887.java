import java.util.*;

public class exercicio 07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int acumuladorSoma = 0;
        int acumuladorMult = 1;
        int vetorNumeros[] = new int[5];

        for(int i = 0; i < vetorNumeros.length; i++) {
            System.out.printf("Digite o %d° valor: ", i+1);
            vetorNumeros[i] = entrada.nextInt();
            acumuladorSoma += vetorNumeros[i];
            acumuladorMult *= vetorNumeros[i];
        }

        System.out.printf("A soma desses valores dará como resultado %d \n", acumuladorSoma);
        System.out.printf("A multiplicação desses valores dará como resultado %d \n", acumuladorMult);
    }
}
