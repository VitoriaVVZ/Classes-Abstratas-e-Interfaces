public class Doce extends Confeitaria {

    public Doce(String tipo, Double preco) {
        super(tipo, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Doce: " + getTipo());
        System.out.println("Tipo: Bolo festivo");
        System.out.println("Preço: R$ " + getPreco());
    }
}