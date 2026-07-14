import java.util.Random;

public class Evento {


    public static void aleatorio(Personagem jogador){

        Random random = new Random();

        int evento = random.nextInt(3);


        if(evento == 0){

            System.out.println("🔦 Você encontrou um Kit Médico.");

            jogador.adicionarItem(
                new Item("Kit Médico")
            );

        }

        else if(evento == 1){

            System.out.println("👻 Uma presença maligna passou por você.");

            jogador.sanidade -= 15;

        }

        else{

            System.out.println("🗝️ Você encontrou uma chave antiga.");

            jogador.adicionarItem(
                new Item("Chave Antiga")
            );
        }
    }
}