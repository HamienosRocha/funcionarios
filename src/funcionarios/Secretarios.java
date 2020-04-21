package funcionarios;

public class Secretarios extends Funcionarios {
    
    public void Secretarios(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    @Override
    public double bonificacao(){
        return(this.salario +  (this.salario * 0.03));
    }
}
