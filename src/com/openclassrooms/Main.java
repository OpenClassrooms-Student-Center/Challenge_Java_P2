package com.openclassrooms;

import com.openclassrooms.store.*;

public class Main {

    public static void main(String[] args) {
        Mouse dellMouse = new Mouse(Brand.DELL, 20.0);
        Screen samsungScreen = new Screen(Brand.SAMSUNG, 150.0, "1920x1080");

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