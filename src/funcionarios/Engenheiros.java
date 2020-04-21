package funcionarios;

public class Engenheiros extends Funcionarios {
    
    public void Engenheiros(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    @Override
    public double bonificacao(){
        return (this.salario + (this.salario * 0.05));
    }
    
}
