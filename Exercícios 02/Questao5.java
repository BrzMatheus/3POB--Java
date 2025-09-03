import java.util.Scanner;

public class Eleitor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = entrada.nextInt();

        int idade = 2025 - anoNascimento; 

        if (idade >= 16) {
            System.out.println("Apto a ser eleitor");
        } else {
            System.out.println("Inapto a ser eleitor");
        }

        entrada.close();
    }
}
