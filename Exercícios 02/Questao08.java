import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de disciplinas em que o aluno não alcançou a média: ");
        int qtdDisciplinas = entrada.nextInt();

        if (qtdDisciplinas == 0) {
            System.out.println("Aprovado");
        } else if (qtdDisciplinas <= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
