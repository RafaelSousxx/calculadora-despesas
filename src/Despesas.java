
public class Despesas {
    private String nome;
    private String categoria;
    private double valor;


    public Despesas(String nome, String categoria, double valor) {
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValor() {
        return valor;
    }

    // Método para exibir os dados formatados
    @Override
    public String toString() {
        return "Despesa: " + nome + " | Categoria: " + categoria + " | Valor: R$" + String.format("%.2f", valor);
    }
}
