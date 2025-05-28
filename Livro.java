public class Livro extends Produto {
    private String autor;
// Construtor: usa super() para inicializar a superclasse Produto
    public Livro(int id, String nome, double preco, String autor) {
        super(id, nome, preco);
        this.autor = autor;
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor;
    }
}
