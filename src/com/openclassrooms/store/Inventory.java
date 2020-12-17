package com.openclassrooms.store;

public class Inventory {

    public Screen[] screens;
    public Mouse[] mice;

    public Inventory() {
        screens = new Screen[10];
        mice = new Mouse[10];
    }

    public void addScreen(Screen a) {
        for(int i = 0; i< screens.length; i++) {
            if(screens[i] == null) {
               screens[i] = a;
               break;
            }
        }
    }

    public void addMouse(Mouse a) {
        for(int i = 0; i< mice.length; i++) {
            if(mice[i] == null) {
                mice[i] = a;
                break;
            }
        }
    }


}
