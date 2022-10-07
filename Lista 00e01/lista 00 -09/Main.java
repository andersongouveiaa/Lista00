import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Tringulo tringulo = new Tringulo();

        System.out.print("Digite o lado A: ");
        tringulo.setLadoA(scanner.nextDouble());
        System.out.print("Digite o lado B: ");
        tringulo.setLadoB(scanner.nextDouble());
        System.out.print("Digite o lado C: ");
        tringulo.setLadoC(scanner.nextDouble());

        System.out.println(tringulo.calculaLadoTringulo());

    }
}