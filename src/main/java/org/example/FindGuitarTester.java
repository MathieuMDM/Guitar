package org.example;

import java.util.List;

public class FindGuitarTester {
    public static void main (String[] agrs){
        Inventory inventory = new Inventory();

        initializeInventory(inventory);
        Guitar whatEveLikes = new Guitar("V95693", Builder.FENDER.name(), "fender", Type.ELECTRIC.toString(), Wood.ALDER.toString(), Wood.OAK.toString(), 250);

        List matchingGuitars = inventory.search(whatEveLikes);

        if (!matchingGuitars.isEmpty()){
            System.out.println("Ewo moze spodoba ci sie gitara ?");
        } else {
            System.out.println("Przykro mi Ewo nic dla Ciebie nie znalazlem");
        }
    }

    private static void initializeInventory(Inventory inventory){
        System.out.println("blad");
    }
}
