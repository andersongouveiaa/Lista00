public class SomaSalario {
    private Funcionario funcionario;
    private Salario salario;

    public void somaSalario(){
        if( funcionario.getSalarioFuncionario() == salario.getSalarioMinimo()){
            System.out.println("Você recebe o salário minimo!");
        }else if ( funcionario.getSalarioFuncionario() < salario.getSalarioMinimo()){
            System.out.println("Você recebe menos que um salario mínimo");
        }else if (funcionario.getSalarioFuncionario() > salario.getSalarioMinimo()){
            System.out.println("Você recebe mais que um salario mínimo");
        }
    }

    public double contaSalario(){
        return funcionario.getSalarioFuncionario() / salario.getSalarioMinimo();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Salario getSalario() {
        return salario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "O funcionario recebe: " + funcionario.getSalarioFuncionario() +
                "\nO salario minimo é: " + salario.getSalarioMinimo()+
                "\nO funcionario recebe " + contaSalario() + " X o valor do salario minimo";
    }
}
