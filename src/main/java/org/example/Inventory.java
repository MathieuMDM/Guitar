package org.example;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<GuitarSpec> guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, String builder, String model, String type, String backWood, String topWood, double priece){
        GuitarSpec guitar = new GuitarSpec(serialNumber, builder, model, type, backWood, topWood, priece);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for (GuitarSpec guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchGuitar) {
        List mathcingGuitars = new LinkedList();
        for (GuitarSpec guitar : guitars) {

            if(searchGuitar.getBuilder() != guitar.getBuilder()){
                continue;
            }

            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel()))) {
                continue;
            }

            if(searchGuitar.getType() != guitar.getType()){
                continue;
            }

            if(searchGuitar.getBackWood() != guitar.getBackWood()) {
                continue;
            }

            if(searchGuitar.getTopWood() != guitar.getTopWood()){
                continue;
            }

            mathcingGuitars.add(guitar);
        }
        return mathcingGuitars;
    }

}
