public class Haras {
    private Integer cavalos;
    private Integer ferraduras;

    public Haras() {
    }

    public Haras(Integer cavalos, Integer ferraduras) {
        this.cavalos = cavalos;
        this.ferraduras = ferraduras;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public int getFerraduras() {
        return ferraduras;
    }

    public void setFerraduras(int ferraduras) {
        this.ferraduras = ferraduras;
    }

    public Integer totalFerradurasDosCavalos(){
        return cavalos * 4;
    }

    @Override
    public String toString(){
        return "Total de ferraduras necessarias para equipar todo o seu haras: " + totalFerradurasDosCavalos();
    }

}
