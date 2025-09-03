import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) { 
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }

        entrada.close();
    }
}
