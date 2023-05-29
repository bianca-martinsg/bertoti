package src;

import java.util.ArrayList;
import java.util.List;

public class Gerente implements Funcionario {
    private String nome;
    private List<Funcionario> subordinados;

    public Gerente(String nome) {
        this.nome = nome;
        this.subordinados = new ArrayList<>();
    }

    public void adicionarSubordinado(Funcionario funcionario) {
        subordinados.add(funcionario);
    }

    public void removerSubordinado(Funcionario funcionario) {
        subordinados.remove(funcionario);
    }

    public void mostrarDetalhes() {
        System.out.println("Gerente: " + nome);
        System.out.println("Subordinados:");

        for (Funcionario funcionario : subordinados) {
            funcionario.mostrarDetalhes();
        }
    }
}
