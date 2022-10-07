public class Triangulo {
    private double catetoA;
    private double catetoB;

    public Triangulo() {
    }

    public Triangulo(double catetoA, double catetoB) {
        this.catetoA = catetoA;
        this.catetoB = catetoB;
    }

    public double getCatetoA() {
        return catetoA;
    }

    public void setCatetoA(double catetoA) {
        this.catetoA = catetoA;
    }

    public double getCatetoB() {
        return catetoB;
    }

    public void setCatetoB(double catetoB) {
        this.catetoB = catetoB;
    }

    public double calculandoHipotenusa(){
        return Math.sqrt(catetoA * catetoA + catetoB * catetoB);
    }

    @Override
    public String toString(){
        return "O valor da Hipotenusa é" + calculandoHipotenusa();
    }

}
