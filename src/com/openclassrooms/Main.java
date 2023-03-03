package com.openclassrooms;

import com.openclassrooms.store.Inventory;
import com.openclassrooms.store.Mouse;
import com.openclassrooms.store.Screen;

public class Main {
    // en commentaire, l'état de la fonction Main avant la modif
    public static void main(String[] args) {
        // System.out.println("Inventory POC");

        // Mouse m = new Mouse("DELL", 20.0);
        // Screen s = new Screen("Samsung", 150.0, "1920x1080");

        Mouse dellMouse = new Mouse(Brand.DELL, 20.0);
        Screen samsungScreen = new Screen(Brand.SAMSUNG, 150.0, "1920x1080");

        // Inventory inventory = new Inventory();
        // inventory.addScreen(s);
        // inventory.addMouse(m);

        Inventory inventory = new Inventory();

        Inventory inventory = new Inventory();
        inventory.addItem(samsungScreen, 5);

        inventory.addItem(dellMouse, 12);
        inventory.removeItem(dellMouse, 2);
        inventory.displayInventoryOnConsole();

        inventory.removeItem(dellMouse, 12);

        inventory.displayInventoryOnConsole();
        inventory.displayItemsOnConsole();

    }
}
