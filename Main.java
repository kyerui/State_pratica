public class Main {
    public static void main(String[] args) {
        System.out.println("--- Cenário 1: Fluxo completo de um pedido ---");
        Order order1 = new Order();
        
        order1.ship();    // Tenta enviar (vai falhar)
        order1.pay();     // Paga (sucesso)
        order1.pay();     // Tenta pagar de novo (aviso)
        order1.ship();    // Envia (sucesso)
        order1.cancel();  // Tenta cancelar (vai falhar)
        order1.deliver(); // Entrega (sucesso)
        order1.ship();    // Tenta enviar de novo (vai falhar)

        System.out.println("\n\n--- Cenário 2: Pedido cancelado pelo usuário ---");
        Order order2 = new Order();

        order2.pay();    // Paga (sucesso)
        order2.cancel(); // Cancela (sucesso)
        order2.ship();   // Tenta enviar (vai falhar)
        
        System.out.println("\n\n--- Cenário 3: Pedido novo cancelado imediatamente ---");
        Order order3 = new Order();
        
        order3.cancel(); // Cancela (sucesso)
        order3.pay();    // Tenta pagar (vai falhar)
    }
}