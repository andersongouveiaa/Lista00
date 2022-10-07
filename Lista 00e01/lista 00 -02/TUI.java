import java.util.Scanner;

public class TUI {
    private Scanner scanner;
     private Tretangulares terra;
     private Dimensoes dime;
     private double numLado;
     private double numAltura;

    public TUI() {
        scanner = new Scanner(System.in);
    }

    public void tui(){
        printTui();
        printResult();
    }
    public void printTui(){
        System.out.println("Qual a atura do seu terreno? ");
        setNumAltura(scanner.nextDouble());
        System.out.println("Qual o lado do seu terreninho baby? ");
        setNumLado(scanner.nextDouble());
        setTerra(new Tretangulares(getNumLado(), getNumAltura()));
        setDime(new Dimensoes(getTerra()));
    }
    public void printResult(){
        System.out.println("Esse é a area do seu terreno: " + dime.area());
    }

    public Tretangulares getTerra() {
        return terra;
    }

    public void setTerra(Tretangulares terra) {
        this.terra = terra;
    }

    public Dimensoes getDime() {
        return dime;
    }

    public void setDime(Dimensoes dime) {
        this.dime = dime;
    }

    public double getNumLado() {
        return numLado;
    }

    public void setNumLado(double numLado) {
        this.numLado = numLado;
    }

    public double getNumAltura() {
        return numAltura;
    }

    public void setNumAltura(double numAltura) {
        this.numAltura = numAltura;
    }
}
