package src;

public class Main {
    public static void main(String[] args) {
        LogRegistry logRegistry = LogRegistry.getInstance();
        logRegistry.addLogEntry("Erro: Falha na conexão com o banco de dados.");
        logRegistry.addLogEntry("Aviso: Espaço em disco está acabando.");

        // Em outro ponto do código ou em outra classe
        LogRegistry anotherLogRegistry = LogRegistry.getInstance();
        anotherLogRegistry.addLogEntry("Informação: O sistema foi iniciado.");

        logRegistry.printLogEntries();
        // Resultado esperado:
        // Erro: Falha na conexão com o banco de dados.
        // Aviso: Espaço em disco está acabando.
        // Informação: O sistema foi iniciado.
    }
}
