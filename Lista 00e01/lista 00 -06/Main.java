import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SomaSalario somaSalario = new SomaSalario();

        System.out.print("Qual o valor atual do salario mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        somaSalario.setSalario(new Salario(salarioMinimo));


        System.out.print("Qual o seu salário: ");
        double salarioFuncionario = scanner.nextDouble();
        somaSalario.setFuncionario(new Funcionario(salarioFuncionario));

        somaSalario.somaSalario();
        System.out.println(somaSalario.toString());
    }

}
