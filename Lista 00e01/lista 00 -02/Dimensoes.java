public class Dimensoes {
    Tretangulares terra;

    public Dimensoes(Tretangulares terra) {
        this.terra = terra;
    }

    public double area(){
        return terra.getLado()*terra.getAltura();
    }

    public Tretangulares getTerra() {
        return terra;
    }

    public void setTerra(Tretangulares terra) {
        this.terra = terra;
    }
}
