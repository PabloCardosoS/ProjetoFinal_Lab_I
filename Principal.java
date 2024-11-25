import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        while (true) {
            System.out.println();
            System.out.println("Para criar um objeto digite: " +
                    "\n (1) - criar uma loja" +
                    "\n (2) - criar um produto" +
                    "\n (3) - sair");
            System.out.print("Digite a opção: ");
            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                System.out.print("Digite o nome da loja: ");
                String nomeLoja = scanner.nextLine();
                System.out.print("Digite a quantidade de funcionários: ");
                int quantidadeFuncionarios = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Digite o salário base do funcionário: ");
                double salarioBaseFuncionario = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Digite o nome da rua: ");
                String nomeDaRua = scanner.nextLine();
                System.out.print("Digite o nome da cidade: ");
                String cidade = scanner.nextLine();
                System.out.print("Digite a UF: ");
                String estado = scanner.nextLine();
                System.out.print("Digite o país: ");
                String pais = scanner.nextLine();
                System.out.print("Digite o CEP: ");
                String cep = scanner.nextLine();
                System.out.print("Digite o número: ");
                String numero = scanner.nextLine();
                System.out.print("Digite o complemento: ");
                String complemento = scanner.nextLine();
                System.out.print("Digite o dia da fundação: ");
                int dia = scanner.nextInt();
                System.out.print("Digite o mês da fundação: ");
                int mes = scanner.nextInt();
                System.out.print("Digite o ano da fundação: ");
                int ano = scanner.nextInt();
                System.out.print("Digite a quantidade máxima de produto da loja: ");
                int quantidadeMaximaDeProduto = scanner.nextInt();
                scanner.nextLine();

                Data dataFundacao = new Data(dia, mes, ano);
                Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaDeProduto);
                System.out.println("Loja criada com sucesso!");
                System.out.println(loja);
                System.out.println("\n");

            } else if (opcao.equals("2")) {
                System.out.print("Digite o nome do produto: ");
                String nomeProduto = scanner.nextLine();
                System.out.print("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                System.out.print("Digite o dia da validade: ");
                int diaValidade = scanner.nextInt();
                System.out.print("Digite o mês da validade: ");
                int mesValidade = scanner.nextInt();
                System.out.print("Digite o ano da validade: ");
                int anoValidade = scanner.nextInt();
                scanner.nextLine();

                Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);
                produto = new Produto(nomeProduto, preco, dataValidade);
                System.out.println("Produto criado com sucesso!");
                System.out.println(produto);

            } else if (opcao.equals("3")) {
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opção inválida! Tente um número válido novamente.");
            }

            if (produto != null) {
                Data dataAtual = new Data(20, 10, 2023);
                if (produto.estaVencido(dataAtual)) {
                    System.out.println("PRODUTO VENCIDO");
                } else {
                    System.out.println("PRODUTO NÃO VENCIDO");
                }
                System.out.println("\n");
            }
        }
        scanner.close();
    }
}

