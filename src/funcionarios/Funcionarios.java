package funcionarios;

public abstract class Funcionarios {
    
    protected String nome;
    protected String cargo;
    protected double salario;
    
    protected abstract double bonificacao();


    protected String getNome() {
        return nome;
    }

    protected double getSalario() {
        return salario;
    }

    protected String getCargo() {
        return cargo;
    }

    protected void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
   
}
