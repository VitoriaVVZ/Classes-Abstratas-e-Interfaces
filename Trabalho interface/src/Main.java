//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Doce bolo = new Doce("Bolo de Chocolate", 45.90);

        System.out.println("=== Detalhes do Pedido ===");
        bolo.exibirDetalhes();

        System.out.println("========================");

        bolo.entrega();

    }
}