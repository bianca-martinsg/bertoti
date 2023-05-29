public class ExemploObserver {
    public static void main(String[] args) {
        // Criar o serviço de notificações
        ServicoNotificacoes servico = new ServicoNotificacoes();

        // Criar alguns usuários
        Usuario usuario1 = new Usuario("João");
        Usuario usuario2 = new Usuario("Maria");
        Usuario usuario3 = new Usuario("Pedro");

        // Registrar os usuários como observadores do serviço de notificações
        servico.adicionarObservador(usuario1);
        servico.adicionarObservador(usuario2);
        servico.adicionarObservador(usuario3);

        // Enviar uma notificação para todos os observadores
        servico.enviarNotificacao("Nova atualização disponível!");

        // Remover um observador
        servico.removerObservador(usuario2);

        // Enviar outra notificação para os observadores restantes
        servico.enviarNotificacao("Mantenha-se atualizado!");

        // Saída esperada:
        // João recebeu a seguinte notificação: Nova atualização disponível!
        // Maria recebeu a seguinte notificação: Nova atualização disponível!
        // Pedro recebeu a seguinte notificação: Nova atualização disponível!
        // João recebeu a seguinte notificação: Mantenha-se atualizado!
        // Pedro recebeu a seguinte notificação: Mantenha-se atualizado!
    }
}
