package org.example;

import java.util.List;

public class FindGuitarTester {
    public static void main (String[] agrs){
        Inventory inventory = new Inventory();

        initializeInventory(inventory);
        GuitarSpec whatEveLikes = new GuitarSpec();

        List matchingGuitars = inventory.search(whatEveLikes);

        if (!matchingGuitars.isEmpty()){
            System.out.println("Ewo moze spodoba ci sie gitara ?" + matchingGuitars);
        } else {
            System.out.println("Przykro mi Ewo nic dla Ciebie nie znalazlem");
        }
    }

    private static void initializeInventory(Inventory inventory){
        System.out.println("blad");
    }
}
