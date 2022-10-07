public class Frase {
    private  String Frase;

    public Frase(String frase) {
        Frase = frase;
    }

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String frase) {
        Frase = frase;
    }

    @Override
    public String toString() {
        return "A frase ficou assim: " + Frase;
    }
}
