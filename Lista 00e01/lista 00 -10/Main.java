import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Joguinho joguinho = new Joguinho();

        System.out.println("-------------------------------------");
        System.out.println("Escolha uma opção para começar o jogo");
        System.out.println("-------------------------------------");

        System.out.println("1:  Pedra\n2: Papel\n3: Tesoura\n >>>>>>>>>>>>>>>>>>>>>>>");
        joguinho.setPessoa(scanner.nextInt());
        joguinho.jogar();
    }
}
