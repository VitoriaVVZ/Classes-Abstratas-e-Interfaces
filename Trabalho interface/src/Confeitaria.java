public abstract class Confeitaria {

    private String tipo;
    private Double preco;

    public Confeitaria(String tipo, Double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String doce) {
        this.tipo = doce;
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public abstract void exibirDetalhes();
}