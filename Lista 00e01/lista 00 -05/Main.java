import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangulo triangulo = new Triangulo();

        System.out.print("Qual o valor para o cateto Adjacente: ");
        trinagulo.setCatetoA(scanner.nextDouble());
        System.out.print("Qual o valor para o cateto Oposto: ");
        trinagulo.setCatetoB(scanner.nextDouble());

        System.out.println(triangulo.toString());
    }
}
