import java.util.ArrayList;
import java.util.Scanner;

public class EquipeTI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Profissional> equipe = new ArrayList<>();

        int opcao = 0;
        while (opcao != 3) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar profissional");
            System.out.println("2 - Aumentar salário de um profissional");
            System.out.println("3 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> cadastrarProfissional(equipe);
                case 2 -> aumentarSalario(equipe, scanner);
                case 3 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    public static void cadastrarProfissional(ArrayList<Profissional> equipe) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código identificador do profissional:");
        int id = scanner.nextInt();

        System.out.println("Digite o nome do profissional:");
        String nome = scanner.next();

        System.out.println("Digite o e-mail do profissional:");
        String email = scanner.next();

        System.out.println("Digite o salário do profissional:");
        double salario = scanner.nextDouble();

        Profissional profissional = new Profissional(id, nome, email, salario);
        equipe.add(profissional);

        System.out.println("Profissional cadastrado com sucesso.");
    }

    public static void aumentarSalario(ArrayList<Profissional> equipe, Scanner scanner) {
        System.out.println("Digite o código identificador do profissional:");
        int id = scanner.nextInt();

        System.out.println("Digite o percentual de aumento:");
        double percentual = scanner.nextDouble();

        boolean encontrado = false;
        for (Profissional profissional : equipe) {
            if (profissional.getId() == id) {
                double novoSalario = profissional.getSalario() * (1 + (percentual / 100));
                profissional.setSalario(novoSalario);
                encontrado = true;
                System.out.println("Salário atualizado com sucesso.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Profissional não encontrado.");
        }
    }
}
