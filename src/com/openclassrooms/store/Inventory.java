package com.openclassrooms.store;

public class Inventory {

    public Screen[] screens;
    public Mouse[] mice;

    public Inventory() {
        screens = new Screen[10];
        mice = new Mouse[10];
    }

    public void addScreen(Screen a) {
        for (int i = 0; i < screens.length; i++) {
            if (screens[i] == null) {
                screens[i] = a;
                break;
            }
        }
    }

    public void addMouse(Mouse a) {
        for (int i = 0; i < mice.length; i++) {
            if (mice[i] == null) {
                mice[i] = a;
                break;
            }
        }
    }

}

/*
 * for(int i=0; i < inventory.screens.length; i++ ) {
 * if(inventory.screens[i] != null) {
 * System.out.println(inventory.screens[i].brand);
 * }
 * }
 * 
 * for(int j = 0; j < inventory.mice.length; j++ ) {
 * if(inventory.mice[j] != null) {
 * System.out.println(inventory.mice[j].brand);
 * }
 * }
 */
