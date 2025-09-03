import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = entrada.nextDouble();

        System.out.print("Digite o sexo do funcionário (M/F): ");
        String sexo = entrada.next();

        double desconto;
        double salarioLiquido;

        if (sexo.equalsIgnoreCase("M")) { 
            desconto = salarioBruto * 0.05;
        } else {
            desconto = salarioBruto * 0.03;
        }

        salarioLiquido = salarioBruto - desconto;

        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        entrada.close();
    }
}
