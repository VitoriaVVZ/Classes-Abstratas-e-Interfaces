public class Doce extends Confeitaria implements Pedido {

    public Doce(String tipo, Double preco) {
        super(tipo, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Doce: " + getTipo());
        System.out.println("Tipo: Bolo festivo");
        System.out.println("Preço: R$ " + getPreco());
    }

    @Override
    public void entrega() {

    System.out.println("Seu pedido acaba de sair para entrega!! :)");
    }
}
