import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NotasAlunos notasAlunos = new NotasAlunos();

        System.out.print("Qual a nota da primeira prova do aluno:");
        notasAlunos.setNota1(scanner.nextDouble());
        System.out.print("Qual a nota da segunda prova do aluno:");
        notasAlunos.setNota2(scanner.nextDouble());

        System.out.println(notasAlunos.toString());
    }
}
