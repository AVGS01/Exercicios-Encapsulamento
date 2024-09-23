public class Produto {

    private String nome;
    private String codigo;
    private double preco;

    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
    }

    public void exibirInformacoes(boolean exibirCodigo) {
        System.out.println("Nome: " + nome);
        if (exibirCodigo) {
            System.out.println("Código: " + codigo);
        }
    }

    public void exibirInformacoes(boolean exibirCodigo, boolean exibirPreco) {
        System.out.println("Nome: " + nome);
        if (exibirCodigo) {
            System.out.println("Código: " + codigo);
        }
        if (exibirPreco) {
            System.out.println("Preço: R$ " + preco);
        }
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Laptop", "123ABC", 2500.00);
        produto.exibirInformacoes();
        produto.exibirInformacoes(true);
        produto.exibirInformacoes(true, true);
    }
}
