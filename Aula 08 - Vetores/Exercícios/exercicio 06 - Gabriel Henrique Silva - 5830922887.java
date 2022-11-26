import java.util.*;

public class exercicio 06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAlunos[] = new double[10];
        int alunosAprovados = 0;
        double acumuladorMedia;

        for (int i = 0; i < mediaAlunos.length; i++) {
            acumuladorMedia = 0;
            for (int cont = 0; cont < 4; cont++) {
                System.out.printf("Digite a %d° nota: ", cont+1, i+1);
                mediaAlunos[i] = entrada.nextDouble();
                acumuladorMedia += mediaAlunos[i];
            }
            System.out.println("///////////////////////////////////");
            if (mediaAlunos[i] >= 7) {
                alunosAprovados++;
            }
        }
        System.out.printf("Apenas %d alunos foram aprovados.", alunosAprovados);
    }
}
