import java.util.*;

public class exercicio 08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade[] = new int[5];
        double altura[] = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite a %d° idade: ", i+1);
            idade[i] = entrada.nextInt();
            System.out.printf("Digite a %d° altura: ", i+1);
            altura[i] = entrada.nextDouble();
            System.out.println("////////////////////////////////");
        }

        for (int j = idade.length - 1; j >= 0; j--) {
            System.out.println("Idade: " +idade[j]);
        }
        System.out.println("////////////////////////////////");

        for (int x = altura.length - 1; x >= 0; x--) {
            System.out.println("Altura: " +altura[x]);
        }
    }
}
