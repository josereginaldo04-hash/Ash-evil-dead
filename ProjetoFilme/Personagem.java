// Personagem.java

import java.util.ArrayList;
import java.util.Scanner;

public class Personagem {

    String nome;
    String classe;

    int vida;
    int vidaMaxima;
    int ataque;
    int defesa;
    int sanidade;

    ArrayList<Item> inventario;


    public Personagem(String nome, int vida, int ataque, int defesa, String classe) {

        this.nome = nome;
        this.classe = classe;

        this.vida = vida;
        this.vidaMaxima = vida;

        this.ataque = ataque;
        this.defesa = defesa;

        this.sanidade = 100;

        inventario = new ArrayList<>();
    }


    public void atacar(Monstro inimigo) {

        int dano = ataque - inimigo.defesa;

        if (dano < 1) {
            dano = 1;
        }

        inimigo.vida -= dano;

        if (inimigo.vida < 0) {
            inimigo.vida = 0;
        }

        System.out.println("\n⚔️ " + nome + " atacou " + inimigo.nome);
        System.out.println("Dano causado: " + dano);
        System.out.println("Vida do inimigo: " + inimigo.vida);
    }


    public void receberDano(int dano) {

        dano -= defesa;

        if (dano < 1) {
            dano = 1;
        }

        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println("\n💀 " + nome + " recebeu " + dano + " de dano.");
        System.out.println("❤️ Vida atual: " + vida);
    }


    public void curar() {

        vida += 30;

        if (vida > vidaMaxima) {
            vida = vidaMaxima;
        }

        System.out.println("🧪 " + nome + " recuperou vida.");
        System.out.println("❤️ Vida: " + vida);
    }


    public void adicionarItem(Item item) {

        inventario.add(item);
    }


    public void mostrarInventario() {

        System.out.println("\n🎒 INVENTÁRIO");

        if (inventario.isEmpty()) {

            System.out.println("Vazio.");

            return;
        }


        for (int i = 0; i < inventario.size(); i++) {

            System.out.println(
                (i + 1) + " - " + inventario.get(i).nome
            );
        }
    }


    public void usarItem() {

        Scanner leitor = new Scanner(System.in);


        if (inventario.isEmpty()) {

            System.out.println("❌ Inventário vazio.");

            return;
        }


        mostrarInventario();


        System.out.print("\nEscolha o item: ");

        int escolha = leitor.nextInt();


        if (escolha < 1 || escolha > inventario.size()) {

            System.out.println("❌ Item inválido.");

            return;
        }


        Item item = inventario.get(escolha - 1);


        System.out.println(
            "\n✨ Usando: " + item.nome
        );


        item.usar(this);


        inventario.remove(escolha - 1);
    }


    public boolean vivo() {

        return vida > 0;
    }
}