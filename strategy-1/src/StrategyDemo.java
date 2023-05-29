package src;

public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context();

        // Executando a primeira estratégia
        context.setStrategy(new ConcreteStrategy1());
        context.executeStrategy();

        // Executando a segunda estratégia
        context.setStrategy(new ConcreteStrategy2());
        context.executeStrategy();
    }
}