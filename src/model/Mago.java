package model;

public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 90, 25, 5);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.ataque - (alvo.defesa / 2);
        if (dano < 0) dano = 0;
        alvo.receberDano(dano);
        System.out.println(nome + " lançou magia em " + alvo.getNome() + " causando " + dano + " de dano!");
    }
}