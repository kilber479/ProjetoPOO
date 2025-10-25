package model;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 120, 20, 10);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.ataque - alvo.defesa;
        if (dano < 0) dano = 0;
        alvo.receberDano(dano);
        System.out.println(nome + " atacou " + alvo.getNome() + " causando " + dano + " de dano!");
    }
}