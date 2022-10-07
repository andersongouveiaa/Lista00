public class Pessoa {
    private String nomePessoa;
    private Integer idadePessoa;

    public Pessoa(){

    }

    public Pessoa(String nomePessoa, Integer idadePessoa) {
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public Integer getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(Integer idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    public Integer calculaAnosTotaisPessoa(){
        return idadePessoa * 365;
    }

    @Override
    public String toString(){
        return "Uma pessoa com " + idadePessoa + " Possui " + calculaAnosTotaisPessoa() + " Anos de vida";
    }


}
