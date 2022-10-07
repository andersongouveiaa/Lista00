import java.util.Scanner;

public class NotasAlunos {

    private double nota1;
    private double nota2;
    private double nota3;

    public NotasAlunos() {
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }


    public String CalculandoAMedia() {
        Double media = (getNota1() + getNota2()) / 2;
        if ((media >= 5) && ((getNota1() >= 3) || (getNota2() >= 3))) {
            return "MEDIA: " + media + "\nAprovado";

        } else {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Aluno não atingiu a média, precisa fazer uma prova FINAL!");
            System.out.print("NOta prova 3 ( Prova FINAL): ");
            setNota3(leitor.nextDouble());
            if (getNota1() > getNota2()) {
                media = (getNota1() + getNota3()) / 2;
                if (media >= 5) {
                    return "MEDIA FINAL: " + media + "\nAprovado";
                } else {
                    return "MEDIA FINAL: " + media + "\nReprovado";
                }
            } else {
                media = (getNota2() + getNota3()) / 2;
                if (media >= 5) {
                    return "MEDIA FINAL: " + media + "\nAprovado";
                } else {
                    return "MEDIA FINAL: " + media + "\nReprovado";
                }
            }
        }

    }

    public String toString(){
        return CalculandoAMedia();
    }


}
