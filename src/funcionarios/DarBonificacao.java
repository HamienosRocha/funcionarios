package funcionarios;

public class DarBonificacao {
    
    public static void main(String[] args) {
        
        // Considerei Engenheiros e Secretários como sendo funcionários comuns
        Engenheiros engenheiro = new Engenheiros();
        engenheiro.Engenheiros("Hamienos Rocha", "Engenheiro", 10000);
        engenheiro.bonificacao();
        System.out.println("Funcionário: " + engenheiro.getNome());
        System.out.println("Cargo: " + engenheiro.getCargo());
        System.out.println("Salário/mês: R$ " + engenheiro.getSalario());
        System.out.println("Salário com bônus R$ : " + engenheiro.bonificacao());
        
        Secretarios secretario = new Secretarios();
        secretario.Secretarios("Marcos", "Secretário", 5000);
        secretario.bonificacao();
        System.out.println("\nFuncionário: " + secretario.getNome());
        System.out.println("Cargo: " + secretario.getCargo());
        System.out.println("Salário/mês: R$ " + secretario.getSalario());
        System.out.println("Salário com bônus R$ : " + secretario.bonificacao());
        
        Gerentes gerente = new Gerentes();
        gerente.Gerentes("João", "Gerente", 15000);
        gerente.bonificacao();
        System.out.println("\nFuncionário: " + gerente.getNome());
        System.out.println("Cargo: " + gerente.getCargo());
        System.out.println("Salário/mês: R$ " + gerente.getSalario());
        System.out.println("Salário com bônus R$ : " + gerente.bonificacao());
        
        Diretores diretor = new Diretores();
        diretor.Diretores("Grande Ladislau", "Secretário", 50000);
        diretor.bonificacao();
        System.out.println("\nFuncionário: " + diretor.getNome());
        System.out.println("Cargo: " + diretor.getCargo());
        System.out.println("Salário/mês: R$ " + diretor.getSalario());
        System.out.println("Salário com bônus R$ : " + diretor.bonificacao());
        
    }
    
}
