public class CalculaPeso {

    private double pesoNaTerra;
    private double gravidadeRelativa;

    public CalculaPeso() {
    }

    public double getPesoNaTerra() {
        return pesoNaTerra;
    }

    public void setPesoNaTerra(double pesoNaTerra) {
        this.pesoNaTerra = pesoNaTerra;
    }

    public double getGravidadeRelativa() {
        return gravidadeRelativa;
    }

    public void setGravidadeRelativa(int opcao) {
        switch (opcao) {
            case 1:
                gravidadeRelativa = 0.37;
                break;
            case 2:
                gravidadeRelativa = 0.88;
                break;
            case 3:
                gravidadeRelativa = 0.38;
                break;
            case 4:
                gravidadeRelativa = 2.64;
                break;
            case 5:
                gravidadeRelativa = 1.15;
                break;
            case 7:
                gravidadeRelativa = 1.17;
                break;
            default:
        }
    }

    public String toString() {
        return "O seu peso de acordo com o planeta será: " + (pesoNaTerra / 10) * gravidadeRelativa + "Kg";
    }
}
