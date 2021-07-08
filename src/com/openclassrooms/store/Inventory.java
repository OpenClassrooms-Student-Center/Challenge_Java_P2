package com.openclassrooms.store;

import java.util.HashMap;
import java.util.Map;

import items.Item;

public class Inventory {

	private Map<Item, Integer> stock; //encapsulation

	public Inventory() {
		stock = new HashMap<>();
	}

	public void addItem(Item item, int quantite) {
		if (stock.get(item) != null) { // vérifier si item déja en stock
			quantite += stock.get(item); // si oui augmenter la quantité par le stock
		}
		stock.put(item, quantite);
	}

	public void removeItem(Item item, int quantite) {
		int newStock = 0;

		if (stock.get(item) != null) // vérifier si item déja en stock
			newStock = stock.get(item) - quantite; // si oui diminuer le stock de la quantite

		if (newStock <= 0 || stock.get(item) == null) { // Si rien en stock
			stock.remove(item); // supprimmer la key item
		} else {
			stock.put(item, newStock); // sinon met à jour le stock
		}
	}

	public void displayInventoryOnConsole() {
		for (Map.Entry<Item, Integer> curseur : stock.entrySet()) {
			System.out.println(curseur.getKey() + " quantité en stock = " + curseur.getValue());
		}
	}

	public void displayItemsOnConsole() {
		stock.keySet().stream().forEach(item -> System.out.println(item.getClass().getSimpleName()+" "+item));
	}

}
