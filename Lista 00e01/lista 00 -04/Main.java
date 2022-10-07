import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Qual sua idade? ");
        int idadePessoa = scanner.nextInt();
        scanner.nextLine();
        pessoa.setIdadePessoa(idadePessoa);

        System.out.println(pessoa.toString());

    }
}
