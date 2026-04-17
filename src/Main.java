import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Informe os dados do produto:");
        System.out.println("----------------------------");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade inicial: ");
        int quantidadeinicial = sc.nextInt();
        System.out.print("Quantidade vendida: ");
        Integer quantidadeVendida = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidadeinicial, quantidadeVendida);
        System.out.println("\n\n");
        produto.realizarVenda(0);

        int quantidade = 0;
        while (quantidade != -1) {
            System.out.println("\n\n----------------------------------------------------------");
            System.out.println("PDV ");
            System.out.println("----------------------------------------------------------");
            System.out.print("Informe a quantidade a ser vendida ou -1 para encerrar: ");
            quantidade = sc.nextInt();
            if (quantidade != -1) {
                produto.realizarVenda(quantidade);
            }
        }

    }
}
