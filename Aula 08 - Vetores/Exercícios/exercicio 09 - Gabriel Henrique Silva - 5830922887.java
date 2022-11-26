import java.util.*;

public class ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[10];
        int somaQuadrados = 0;

        for (int i = 0; i< a.length; i++) {
            System.out.printf("Digite o %d° valor: ", i+1);
            a[i] = entrada.nextInt();
            a[i] = (int) Math.pow(a[i], 2);
            somaQuadrados += a[i];
        }

        System.out.println("A soma dos quadrados será de: " +somaQuadrados);
    }
}
