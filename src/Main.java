import view.JogoView;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JogoView view = new JogoView();

        int opcao;
        do {
            view.exibirMenuInicial();
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 1) {
                view.iniciarInterface();
            } else if (opcao != 2) {
                System.out.println("Opção inválida! Tente novamente.\n");
            }
        } while (opcao != 2);

        System.out.println("Encerrando o jogo... Até mais!");
        sc.close();
    }
}
