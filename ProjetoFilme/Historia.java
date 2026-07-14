// Historia.java

public class Historia {


    public static void inicio(){

        System.out.println("======================================");
        System.out.println("          ASH EVIL DEAD");
        System.out.println("======================================");

        System.out.println(
        "\nUma noite que deveria ser apenas uma viagem...");
        
        System.out.println(
        "se transformou em um pesadelo.");

        System.out.println(
        "\nUma antiga cabana guarda um segredo.");

        System.out.println(
        "Um livro proibido despertou algo que nunca deveria voltar.");

        System.out.println(
        "\nA floresta agora pertence às sombras.");
    }



    public static void capituloUm(Personagem jogador){

        System.out.println("\n=================================");
        System.out.println("CAPÍTULO 1 - A CABANA");
        System.out.println("=================================");

        System.out.println(
        jogador.nome + " entra na floresta.");

        System.out.println(
        "O silêncio é quebrado por uma voz desconhecida...");

        System.out.println(
        "\"Vocês abriram a porta... agora paguem o preço.\"");
    }



    public static void capituloDois(){

        System.out.println("\n=================================");
        System.out.println("CAPÍTULO 2 - O PORÃO");
        System.out.println("=================================");

        System.out.println(
        "Um símbolo estranho aparece no chão.");

        System.out.println(
        "Algo poderoso protege o segredo da cabana.");
    }



    public static void finalBom(Personagem jogador){

        System.out.println("\n=================================");
        System.out.println("FINAL");
        System.out.println("=================================");

        System.out.println(
        jogador.nome + " destruiu a maldição.");

        System.out.println(
        "A floresta finalmente voltou ao silêncio.");

        System.out.println(
        "Mas o livro desapareceu...");
    }



    public static void finalRuim(){

        System.out.println("\n=================================");
        System.out.println("FIM");
        System.out.println("=================================");

        System.out.println(
        "A escuridão venceu.");

        System.out.println(
        "A maldição encontrou um novo lar.");
    }
}