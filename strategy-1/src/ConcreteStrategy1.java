package src;
// ConcreteStrategy1

class ConcreteStrategy1 implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executando strategy 1");
    }
}