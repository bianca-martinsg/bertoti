package src;

public class FuncionarioIndividual implements Funcionario {
    private String nome;

    public FuncionarioIndividual(String nome) {
        this.nome = nome;
    }

    public void mostrarDetalhes() {
        System.out.println("Funcionário: " + nome);
    }
}
