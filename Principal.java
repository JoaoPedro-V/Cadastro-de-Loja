import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Loja loja = new Loja();
        int opcao;

        do {
            String menu = "1 - Cadastrar Cliente\n" +
                          "2 - Cadastrar Produto\n" +
                          "3 - Realizar Venda\n" +
                          "4 - Listar Clientes\n" +
                          "5 - Listar Produtos\n" +
                          "6 - Listar Vendas\n" +
                          "0 - Sair";

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    // Cadastro Clientes
                    try {
                        String nome = JOptionPane.showInputDialog("Nome do Cliente:");
                        String cpf = JOptionPane.showInputDialog("CPF (11 dígitos):");
                        loja.adicionarCliente(new Cliente(nome, cpf));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                    }
                    break;
                case 2:
                    // Cadastro Produto
                    String tipo = JOptionPane.showInputDialog("Digite 'L' para Livro ou qualquer outra tecla para Produto comum:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("ID do Produto:"));
                    String nome = JOptionPane.showInputDialog("Nome do Produto:");
                    double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do Produto:"));
                    if (tipo.equalsIgnoreCase("L")) {
                        String autor = JOptionPane.showInputDialog("Autor do Livro:");
                        loja.adicionarProduto(new Livro(id, nome, preco, autor));
                    } else {
                        loja.adicionarProduto(new Produto(id, nome, preco));
                    }
                    break;
                case 3:
                    if (loja.getQtdClientes() == 0 || loja.getQtdProdutos() == 0) {
                        JOptionPane.showMessageDialog(null, "Cadastre clientes e produtos antes de vender.");
                        break;
                    }
                    int idxCliente = Integer.parseInt(JOptionPane.showInputDialog(loja.listarClientes() + "\nEscolha o índice do cliente (0 a " + (loja.getQtdClientes()-1) + "):"));
                    int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de produtos na venda:"));
                    Produto[] produtosVenda = new Produto[qtd];
                    for (int i = 0; i < qtd; i++) {
                        int idxProduto = Integer.parseInt(JOptionPane.showInputDialog(loja.listarProdutos() + "\nEscolha o índice do produto (0 a " + (loja.getQtdProdutos()-1) + ") para o item " + (i+1)));
                        produtosVenda[i] = loja.getProdutos()[idxProduto];
                    }
                    loja.realizarVenda(loja.getClientes()[idxCliente], produtosVenda, qtd);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, loja.listarClientes());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, loja.listarProdutos());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, loja.listarVendas());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 0);
    }
}
