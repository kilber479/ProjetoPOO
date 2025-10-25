package view;

import service.JogoService;

public class JogoView {

    public void exibirMenuInicial() {
        System.out.println("==================================");
        System.out.println("      SIMULADOR DE BATALHA RPG");
        System.out.println("==================================");
        System.out.println("1 - Iniciar Jogo");
        System.out.println("2 - Sair");
        System.out.println("==================================\n");
    }

    public void iniciarInterface() {
        JogoService jogoService = new JogoService();
        jogoService.iniciar();
    }
}
