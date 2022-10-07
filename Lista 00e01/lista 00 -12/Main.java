import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculaPeso calculaPeso = new CalculaPeso();


        System.out.println("----------------------------------------");
        System.out.println("Calculando peso de acordo com o planeta");
        System.out.println("----------------------------------------");

        System.out.print("Qual o seu peso atual?: ");

        calculaPeso.setPesoNaTerra(scanner.nextDouble());


        System.out.println("----------------------------------------");
        System.out.println("Esccolha uma opção para calcular seu peso no planeta:");
        System.out.println("----------------------------------------");
        System.out.println("1: Mercurio\n2: Venus\n3: Marte\n4: Jupiter\n5: Saturno\n6: Urano\n");
        calculaPeso.setGravidadeRelativa(scanner.nextInt());


        System.out.println(calculaPeso.toString());

    }
}
