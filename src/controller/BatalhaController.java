package controller;

import model.Personagem;

public class BatalhaController {
    public void iniciarBatalha(Personagem p1, Personagem p2) {
        System.out.println("⚔️ Iniciando batalha entre " + p1.getNome() + " e " + p2.getNome() + "!\n");

        while (p1.estaVivo() && p2.estaVivo()) {
            p1.atacar(p2);
            if (!p2.estaVivo()) break;
            p2.atacar(p1);
            System.out.println(p1.getNome() + ": " + p1.getVida() + " HP | " + p2.getNome() + ": " + p2.getVida() + " HP\n");
        }

        System.out.println("\n🏁 Fim da batalha!");
        System.out.println(p1.estaVivo() ? p1.getNome() + " venceu!" : p2.getNome() + " venceu!");
    }
}
