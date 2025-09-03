import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Leitura das duas primeiras notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("Média inicial: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
           
            System.out.print("Digite a terceira nota (peso 2): ");
            double nota3 = entrada.nextDouble();

            double novaMedia = (nota1 + nota2 + 2 * nota3) / 4;
            System.out.println("Nova média: " + novaMedia);

            if (novaMedia >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }

        entrada.close();
    }
}
