public class PaidOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("AVISO: O pedido já foi pago.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Pedido enviado para o cliente.");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void deliver(Order order) {
        System.out.println("ERRO: O pedido ainda não foi enviado. Não pode ser entregue.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Pedido cancelado e pagamento estornado.");
        order.setState(new CanceledOrderState());
    }
}