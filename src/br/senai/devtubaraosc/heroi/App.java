package br.senai.devtubaraosc.heroi;

import br.senai.devtubaraosc.heroi.model.Heroi;
import java.util.Scanner;

public class App {

    // Constantes para códigos de cores ANSI
    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Heroi heroi = null;
        Heroi[] heroisCadastrados = new Heroi[5]; // Capacidade para 5 heróis
        int indice = 0;

        try {
            // Loop principal do programa
            while (true) {
                // Exibir o menu com cor azul
                System.out.println();
                System.out.println(BLUE + "===== MENU =====" + RESET);
                System.out.println();
                System.out.println(BLUE + "1. Adicionar Herói" + RESET);
                System.out.println();
                System.out.println(BLUE + "2. Listar Heróis" + RESET);
                System.out.println();
                System.out.println(BLUE + "3. Sair" + RESET);
                System.out.println();
                System.out.print(BLUE + "Escolha uma opção: " + RESET);
                System.out.println();

                // Ler a opção do usuário
                String opcao = scanner.nextLine();

                // Realizar a ação correspondente à opção escolhida
                switch (opcao) {
                    case "1":
                        // Adicionar um novo herói
                        System.out.print("Nome do Herói: ");
                        String nome = scanner.nextLine();
                        // Não há verificação para o nome
                        
                        System.out.print("Superpoder do Herói: ");
                        String superpoder = scanner.nextLine();
                        
                        System.out.print("Idade do Herói: ");
                        String idadeStr = scanner.nextLine();
                        // Verificar se a idade é um número
                        if (!idadeStr.matches("\\d+")) {
                            System.out.println(RED + "Por favor, insira uma idade válida." + RESET);
                            continue;
                        }
                        int idade = Integer.parseInt(idadeStr);
                        
                        heroi = new Heroi(nome, superpoder, idade);
                        heroisCadastrados[indice] = heroi;
                        indice++;
                        System.out.println(YELLOW + "Herói adicionado com sucesso!" + RESET);
                        break;
                    case "2":
                        // Listar todos os heróis cadastrados
                        if (indice == 0) {
                            System.out.println(YELLOW + "Nenhum herói cadastrado." + RESET);
                        } else {
                            System.out.println(YELLOW + "===== LISTA DE HERÓIS =====" + RESET);
                            for (int i = 0; i < indice; i++) {
                                System.out.println(YELLOW + "Nome: " + heroisCadastrados[i].getNome());
                                System.out.println(YELLOW + "Superpoder: " + heroisCadastrados[i].getSuperpoder());
                                System.out.println(YELLOW + "Idade: " + heroisCadastrados[i].getIdade());
                                System.out.println(YELLOW + "-----------------------------" + RESET);
                            }
                        }
                        break;
                    case "3":
                        // Sair do sistema
                        System.out.println(YELLOW + "Saindo do sistema..." + RESET);
                        return; // Encerra o método main
                    default:
                        // Opção inválida
                        System.out.println(RED + "Opção inválida. Por favor, escolha uma opção válida." + RESET);
                }
            }
        } finally {
            // Fechar o scanner ao sair do loop principal
            scanner.close(); // Fecha o Scanner
        }
    }
}
