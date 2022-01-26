package com.openclassrooms;

import com.openclassrooms.store.*;

import items.Brand;
import items.Mouse;
import items.Screen;

public class Main {

	public static void main(String[] args) {
		Mouse dellMouse = new Mouse(Brand.DELL, 20.0f); // suffixer le prix par f (float)
		Screen samsungScreen = new Screen(Brand.SAMSUNG, 150.0f, "1920x1080"); // la JVM le voit comme un double par
																				// defaut

		Inventory inventory = new Inventory();
		
		inventory.addItem(samsungScreen, 5);
		inventory.addItem(dellMouse, 12);
		inventory.removeItem(dellMouse, 2);
		inventory.displayInventoryOnConsole();
		System.out.println("*****");
		
		inventory.removeItem(dellMouse, 12);
		inventory.displayInventoryOnConsole();
		System.out.println("***");
		inventory.displayItemsOnConsole();
	}
}