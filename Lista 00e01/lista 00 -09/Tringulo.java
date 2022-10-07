public class Tringulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Tringulo() {

    }

    public Tringulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }



    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public String calculaLadoTringulo() {

        if (getLadoA() != getLadoB() && getLadoA() != getLadoC()) {
            System.out.println("Triangulo Escaleno!");
        } else {
            if (getLadoA() == getLadoB() && getLadoA() == getLadoC()) {
                System.out.println("Triangulo Equilatero!");
            }else{
                System.out.println("Triangulo Isosceles!");
            }
        }
        return "Acabou!";
    }



}
