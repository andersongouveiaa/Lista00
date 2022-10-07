import java.util.Scanner;

public class TUI {

    Frase frase;
    TrocaFrase troca;
    private String Palavra;
    private String NovaFrase;
    Scanner scanner;

    public TUI() {
        scanner = new Scanner(System.in);
    }

    public void tui(){
        printTUI();
        printResult();
    }

    public void printTUI(){
        System.out.println("Digite uma frase:");
        setFrase(new Frase(scanner.nextLine()));
        System.out.println("Escolha uma palavra para trocar na frase");
        setPalavra(scanner.nextLine());
        System.out.println("Digite por qual palavra quer fazer a troca");
        setNovaFrase(scanner.nextLine());
        setTroca(new TrocaFrase(frase));
    }

    public Frase getFrase() {
        return frase;
    }

    public void setFrase(Frase frase) {
        this.frase = frase;
    }

    public TrocaFrase getTroca() {
        return troca;
    }

    public void setTroca(TrocaFrase troca) {
        this.troca = troca;
    }

    public String getPalavra() {
        return Palavra;
    }

    public void setPalavra(String palavra) {
        Palavra = palavra;
    }

    public String getNovaFrase() {
        return NovaFrase;
    }

    public void setNovaFrase(String novaFrase) {
        NovaFrase = novaFrase;
    }

    public  void printResult(){
        System.out.println(troca.Alterado(this.Palavra, this.NovaFrase));
    }
}
