import java.util.ArrayList;
import java.util.List;

public class ServicoNotificacoes {
    private List<Observer> observadores = new ArrayList<>();

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void enviarNotificacao(String mensagem) {
        for (Observer observador : observadores) {
            observador.receberNotificacao(mensagem);
        }
    }
}
