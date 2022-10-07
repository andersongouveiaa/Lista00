import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Losango losango = new Losango();

        System.out.print("Qual o valor para o Losango A: ");
        losango.setLosangoA(scanner.nextDouble());
        System.out.print("Qual o valor para o losango B: ");
        losango.setLosangoB(scanner.nextDouble());

        System.out.println(losango.toString());
    }
}