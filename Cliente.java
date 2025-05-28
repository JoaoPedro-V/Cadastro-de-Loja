public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        setCpf(cpf);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) {
        if (cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF deve conter exatamente 11 dígitos.");
        }
    }

    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}