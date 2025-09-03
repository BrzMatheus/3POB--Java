import java.util.Scanner;

public class ServicoMilitar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = entrada.nextInt();

      System.out.print("Digite o sexo (M/F): ");
        String sexo = entrada.next();

        int idade = 2025 - anoNascimento;

        if (sexo.equalsIgnoreCase("M") && idade == 18) {
            System.out.println("Serviço Militar Obrigatório");
        } else {
            System.out.println("Isento de Serviço Militar");
        }

        entrada.close();
    }
}
