public class Item {

    String nome;


    public Item(String nome){

        this.nome = nome;
    }


    public void usar(Personagem jogador){

        switch(nome){

            case "Kit Médico":

                jogador.curar();

                break;


            case "Poção Sombria":

                jogador.vida += 50;

                if(jogador.vida > jogador.vidaMaxima){

                    jogador.vida = jogador.vidaMaxima;
                }

                System.out.println("🧪 Energia restaurada!");

                break;


            case "Amuleto":

                jogador.sanidade += 30;

                if(jogador.sanidade > 100){

                    jogador.sanidade = 100;
                }

                System.out.println("🔮 Sua mente foi protegida.");

                break;


            default:

                System.out.println("O item não pode ser usado agora.");
        }
    }
}