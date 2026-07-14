// Monstro.java

public class Monstro {

    String nome;
    int vida;
    int ataque;
    int defesa;


    public Monstro(String nome, int vida, int ataque) {

        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = 5;
    }


    public void atacar(Personagem jogador) {

        System.out.println("\n👹 " + nome + " atacou!");

        jogador.receberDano(ataque);
    }


    public boolean vivo() {

        return vida > 0;
    }
}