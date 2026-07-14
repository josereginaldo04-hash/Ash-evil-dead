// Boss.java

public class Boss extends Monstro {


    public Boss(String nome, int vida, int ataque){

        super(nome, vida, ataque);
    }


    public void habilidadeEspecial(Personagem jogador){

        System.out.println(
        "☠️ O chefe usa uma habilidade sombria!"
        );

        jogador.receberDano(30);

        jogador.sanidade -= 20;
    }
}