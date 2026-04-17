public class Produto {
    String nome;
    double preco;
    int quantidadeInicial;
    int quantidadeVendida;

    public Produto() {
    }

    public Produto(String nome, double preco, Integer quantidadeInicial, Integer quantidadeVendida) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeInicial = quantidadeInicial;
        this.quantidadeVendida = quantidadeVendida;
    }

    public void realizarVenda(Integer quantidade) {

        if (quantidade < 0) {
            System.out.println("-----------------------------------------------");
            System.out.println("A quantidade vendidade deve ser maior que zero!");
            System.out.println("-----------------------------------------------");
        } else {
            if (quantidade > (quantidadeInicial - quantidadeVendida)) {
                System.out.println("-----------------------------------------");
                System.out.println("Estoque insuficiente para realizar venda!");
                System.out.println("-----------------------------------------");
            } else {
                System.out.printf("Produto: %s\n", nome);
                System.out.printf("Preço: R$ %.2f\n", preco);
                System.out.printf("Estoque antes da venda: %d unidades\n", quantidadeInicial - quantidadeVendida);
                if (quantidade > 0) {
                    System.out.printf("Venda realizada: %d unidades\n", quantidade);
                    quantidadeVendida += quantidade;
                }
                System.out.printf("Estoque atualizado: %d unidades\n\n", quantidadeInicial - quantidadeVendida);
            }
        }
    }

}
