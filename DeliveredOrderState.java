public class DeliveredOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("ERRO: O pedido já foi pago e entregue.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("ERRO: O pedido já foi entregue.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("AVISO: O pedido já foi entregue.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("ERRO: Não é possível cancelar um pedido já entregue.");
    }
}