package com.arrowalk.mylibs;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood){
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        this.guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for( Iterator<Guitar> i = this.guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        for(Iterator<Guitar> i = this.guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            //Ignore serial number since that's unique
            //Ignore price since that's unique

            if(isValidProperty(searchGuitar.getBuilder(), guitar.getBuilder())) continue;
            if(isValidProperty(searchGuitar.getModel(), guitar.getModel())) continue;
            if(isValidProperty(searchGuitar.getType(), guitar.getType())) continue;
            if(isValidProperty(searchGuitar.getBackWood(), guitar.getBackWood())) continue;
            if(isValidProperty(searchGuitar.getTopWood(), guitar.getTopWood())) continue;
            
        }
        return null;
    }

    private boolean isValidProperty(String searchProperty, String compareProperty) {
        return ( ( searchProperty != null ) && ( !searchProperty.equals("") ) && ( !searchProperty.equals(compareProperty) ) )? true : false;
    }

}