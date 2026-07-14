// Inventario.java

import java.util.ArrayList;

public class Inventario {

    ArrayList<Item> itens;


    public Inventario(){

        itens = new ArrayList<>();
    }


    public void adicionar(Item item){

        itens.add(item);
    }


    public void listar(){

        System.out.println("\n🎒 INVENTÁRIO:");

        for(Item item : itens){

            System.out.println("- " + item.nome);
        }
    }
}