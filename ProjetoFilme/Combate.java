// Combate.java

import java.util.Scanner;
import java.util.Random;

public class Combate {

    public static void iniciar(Personagem jogador, Monstro inimigo) {

        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\n================================");
        System.out.println("⚠️ INÍCIO DO COMBATE");
        System.out.println(inimigo.nome + " apareceu!");
        System.out.println("================================");

        while (jogador.vivo() && inimigo.vivo()) {

            System.out.println("\n❤️ Vida: " + jogador.vida);
            System.out.println("😨 Sanidade: " + jogador.sanidade);
            System.out.println("👹 " + inimigo.nome + ": " + inimigo.vida + " HP");

            System.out.println("\n1 - Atacar");
            System.out.println("2 - Usar item");
            System.out.println("3 - Recuperar sanidade");
            System.out.println("4 - Fugir");

            System.out.print("Ação: ");
            int escolha = leitor.nextInt();


            switch (escolha) {

                case 1:

                    if(random.nextInt(100) < 20){

                        System.out.println("💥 ATAQUE CRÍTICO!");

                        inimigo.vida -= jogador.ataque * 2;

                    } else {

                        jogador.atacar(inimigo);
                    }

                    break;


                case 2:

                    jogador.usarItem();

                    break;


                case 3:

                    jogador.sanidade += 20;

                    if(jogador.sanidade > 100){

                        jogador.sanidade = 100;
                    }

                    System.out.println("🕯️ Sua mente se acalmou.");

                    break;


                case 4:

                    System.out.println("Você tentou fugir...");

                    if(random.nextBoolean()){

                        System.out.println("Você conseguiu escapar!");

                        return;

                    }else{

                        System.out.println("A criatura bloqueou sua fuga!");
                    }

                    break;


                default:

                    System.out.println("Ação inválida.");

            }


            if(inimigo.vivo()){

                inimigo.atacar(jogador);

                jogador.sanidade -= 5;

                if(jogador.sanidade < 0){

                    jogador.sanidade = 0;
                }
            }
        }


        if(inimigo.vida <= 0){

            System.out.println("\n☠️ " + inimigo.nome + " foi derrotado!");
        }
    }
}