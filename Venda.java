public class Venda {
    private Cliente cliente;
    private Produto[] produtos;
    private int qtdProdutos;

    public Venda(Cliente cliente, Produto[] produtos, int qtdProdutos) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.qtdProdutos = qtdProdutos;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < qtdProdutos; i++) {
            total += produtos[i].getPreco();
        }
        return total;
    }

    public String listarProdutos() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < qtdProdutos; i++) {
            sb.append(produtos[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public String toString() {
        return "Cliente: " + cliente.getNome() + "\nProdutos:\n" + listarProdutos() + "Total: R$" + calcularTotal();
    }
}