public class TrocaFrase {
    Frase frase;

    public TrocaFrase(Frase frase) {
        this.frase = frase;
    }

    public String Alterado( String palavra, String NovaFrase){
        return frase.toString().replace(palavra, NovaFrase);
    }
}
