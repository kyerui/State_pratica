public class CanceledOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("ERRO: Não é possível pagar por um pedido cancelado.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("ERRO: Não é possível enviar um pedido cancelado.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("ERRO: Não é possível entregar um pedido cancelado.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("AVISO: Este pedido já se encontra cancelado.");
    }
}