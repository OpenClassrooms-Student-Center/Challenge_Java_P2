package com.openclassrooms;

import com.openclassrooms.store.Inventory;
import com.openclassrooms.store.Mouse;
import com.openclassrooms.store.Screen;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inventory POC");

        Mouse m = new Mouse("DELL", 20.0);
        Screen s = new Screen("Samsung", 150.0, "1920x1080");

        Inventory inventory = new Inventory();
        inventory.addScreen(s);
        inventory.addMouse(m);

        for(int i=0; i < inventory.screens.length; i++ ) {
            if(inventory.screens[i] != null) {
                System.out.println(inventory.screens[i].brand);
            }
        }

        for(int j = 0; j < inventory.mice.length; j++ ) {
            if(inventory.mice[j] != null) {
                System.out.println(inventory.mice[j].brand);
            }
        }


    }
}
