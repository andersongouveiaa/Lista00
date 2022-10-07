public class Losango {
    private double losangoA;
    private double losangoB;


    public Losango() {
    }

    public Losango(double losangoA, double losangoB) {
        this.losangoA = losangoA;
        this.losangoB = losangoB;
    }

    public double getLosangoA() {
        return losangoA;
    }

    public void setLosangoA(double losangoA) {
        this.losangoA = losangoA;
    }

    public double getLosangoB() {
        return losangoB;
    }

    public void setLosangoB(double losangoB) {
        this.losangoB = losangoB;
    }

    public double calculaAreaDiagonal(){
        return(getLosangoA() * getLosangoB())/2;
    }

    @Override
    public String toString(){
        return "O valor da area do losango foi: " + calculaAreaDiagonal();
    }
}
