package src;

public class ExemploComposite {
    public static void main(String[] args) {
        Funcionario joao = new FuncionarioIndividual("João");
        Funcionario maria = new FuncionarioIndividual("Maria");

        Gerente pedro = new Gerente("Pedro");
        pedro.adicionarSubordinado(joao);
        pedro.adicionarSubordinado(maria);

        pedro.mostrarDetalhes();

        // Remover um subordinado do gerente
        pedro.removerSubordinado(joao);

        System.out.println("--- Após remover subordinado ---");
        pedro.mostrarDetalhes();
    }
}
