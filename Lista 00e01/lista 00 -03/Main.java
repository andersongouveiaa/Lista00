import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade de cavalos comprados: ");
        int cavalos = scanner.nextInt();

        Haras haras = new Haras();
        haras.setCavalos(cavalos);

        System.out.println(haras.toString());

    }
}
