// AshEvilDead.java

import java.util.Scanner;

public class AshEvilDead {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Historia.inicio();

        System.out.print("\nDigite o nome do sobrevivente: ");
        String nome = leitor.nextLine();

        System.out.println("\nEscolha seu personagem:");
        System.out.println("1 - Ethan (Combatente)");
        System.out.println("2 - Sarah (Sobrevivente)");
        System.out.println("3 - Lucas (Atirador)");
        System.out.println("4 - Emily (Médica)");
        System.out.println("5 - Noah (Corajoso)");

        int escolha = leitor.nextInt();

        Personagem jogador;

        switch (escolha) {

            case 1:
                jogador = new Personagem(nome, 120, 20, 10, "Ethan");
                break;

            case 2:
                jogador = new Personagem(nome, 90, 18, 15, "Sarah");
                break;

            case 3:
                jogador = new Personagem(nome, 100, 25, 5, "Lucas");
                break;

            case 4:
                jogador = new Personagem(nome, 110, 17, 12, "Emily");
                break;

            default:
                jogador = new Personagem(nome, 100, 22, 8, "Noah");
        }

        jogador.adicionarItem(new Item("Lanterna"));
        jogador.adicionarItem(new Item("Faca"));

        Historia.capituloUm(jogador);

        Monstro espirito = new Monstro(
                "Espírito da Floresta",
                80,
                15
        );

        Combate.iniciar(jogador, espirito);

        if (jogador.vivo()) {

            Historia.capituloDois();

            Monstro criatura = new Monstro(
                    "Criatura da Cabana",
                    120,
                    20
            );

            Combate.iniciar(jogador, criatura);
        }


        if (jogador.vivo()) {

            Historia.finalBom(jogador);

        } else {

            Historia.finalRuim();
        }


        leitor.close();
    }
}