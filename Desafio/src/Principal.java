
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao = 0;
        int contOpcao = 0;
        Loja loja = null;
        Produto produto = null;

        while (opcao != 3 && contOpcao <= 2) {
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    loja = criarLoja(input);
                    System.out.println(loja);
                    contOpcao++;
                    break;
                case 2:
                    produto = criarProduto(input);
                    System.out.println(produto);
                    contOpcao++;
                    break;
                case 3:
                    System.out.println("Fechando programa!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        Data verificarData = new Data(20, 10, 2023);
        if(produto.estaVencido(verificarData)){
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }

        input.close();
    }

    private static Produto criarProduto(Scanner input) {
        System.out.println("Digite a data de validade do produto");
        System.out.println("Digite o dia");
        int dia = input.nextInt();
        System.out.println("Digite o mes");
        int mes = input.nextInt();
        System.out.println("Digite o ano");
        int ano = input.nextInt();
        Data data = new Data(dia, mes, ano);

        System.out.println("Digite o nome do produto");
        String nomeProduto = input.next();
        System.out.println("Digite o preço do produto");
        double preco = input.nextDouble();

        return new Produto(nomeProduto, preco, data);
    }

    private static Loja criarLoja(Scanner input) {
        System.out.println("Digite os dados do endereço da loja");
        System.out.println("Rua");
        String rua = input.next();
        System.out.println("Cidade");
        String cidade = input.next();
        System.out.println("Estado");
        String estado = input.next();
        System.out.println("País");
        String pais = input.next();
        System.out.println("CEP");
        String cep = input.next();
        System.out.println("Numero");
        String numero = input.next();
        System.out.println("Complemento");
        String complemento = input.next();

        Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

        System.out.println("Digite os dados da fundação da loja");
        System.out.println("dia, mes, ano");
        int dia = input.nextInt();
        System.out.println("Mes");
        int mes = input.nextInt();
        System.out.println("Ano");
        int ano = input.nextInt();

        Data data = new Data(dia, mes, ano);

        System.out.println("Digite o restante dos dados da loja");
        System.out.println("Nome");
        String nome = input.next();
        System.out.println("Quantidade de funcionarios");
        int quantidadeDeFuncionarios = input.nextInt();
        System.out.println("Salario base");
        double salarioBase = input.nextDouble();
        System.out.println("Digite o tamanho do estoque");
        int tamanhoEstoque = input.nextInt();

        return new Loja(nome, quantidadeDeFuncionarios, salarioBase, endereco, data, tamanhoEstoque);
    }
}
