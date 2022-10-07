import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Apolice apolice = new Apolice();

        System.out.print("Nome: ");
        apolice.setNome(scanner.nextLine());
        System.out.print("Idade: ");
        apolice.setIdade(scanner.nextInt());
        System.out.print("Valor da police: ");
        apolice.setValor(scanner.nextFloat());
        System.out.print("Digite sua cidade: ");
        scanner.nextLine();
        apolice.setCidade(scanner.nextLine());
        apolice.desconto(apolice.getCidade());

        System.out.println(apolice);
    }
}