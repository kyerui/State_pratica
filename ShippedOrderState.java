public class ShippedOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("ERRO: O pedido já foi pago e enviado.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("AVISO: O pedido já foi enviado.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Pedido entregue ao cliente com sucesso.");
        order.setState(new DeliveredOrderState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("ERRO: Não é possível cancelar um pedido que já foi enviado.");
    }
}