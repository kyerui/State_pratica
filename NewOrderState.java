public class NewOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Pagamento efetuado com sucesso.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void ship(Order order) {
        System.out.println("ERRO: O pedido ainda não foi pago. Não pode ser enviado.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("ERRO: O pedido ainda não foi pago. Não pode ser entregue.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Pedido cancelado com sucesso.");
        order.setState(new CanceledOrderState());
    }
}