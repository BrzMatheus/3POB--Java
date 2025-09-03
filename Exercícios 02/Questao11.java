import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = entrada.nextDouble();

        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("Não forma triângulo");
        } else {
            System.out.println("Forma triângulo");
        }

        entrada.close();
    }
}
