package com.arrowalk;
import com.arrowalk.mylibs.*;

public class App 
{
    public static void main( String[] args )
    {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        
        Guitar whatCustomerWants = new Guitar("", 0, "fender", "Stratocastor", "electrict", "Alder", "Alder");
        Guitar guitar = inventory.search(whatCustomerWants);
        if ( guitar != null ) {
            System.out.println("You might like this guitar " + guitar);
            System.out.println("You can have it for only $ " + guitar.getPrice() );
        } else {
            System.out.println("Sorry, we could find a guitar for you.");
        }
    }

    public static void initializeInventory(Inventory inventory) {

    }
}
