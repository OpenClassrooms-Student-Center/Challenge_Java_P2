package com.openclassrooms.store;

import java.util.HashMap;
import java.util.Map;

/**
 * Manage items and quantity of them
 * Can display all items on the console
 */
public class Inventory {

    private Map<Item, Integer> items = new HashMap<>();

    public Inventory() {    }

    public Inventory(Map<Item, Integer> existingItems) {
        items.putAll(existingItems);
    }

    /**
     * Add the quantity of the item in the inventory.
     * It considers the existing quantity.
     * @param item The item to add in the inventory
     * @param quantity The quantity of item to add
     */
    public void addItem(Item item, Integer quantity) {
        if(items.containsKey(item)) {
            quantity = items.get(item) + quantity;
        }
        items.put(item, quantity);
    }

    /**
     * Remove the provided quantity of an item from the inventory
     * Don't manage error cases.
     * If the new quantity (existing quantity - provided quantity) is less than 0
     * then the inventory must contain 0;
     * @param item The item to remove from the inventory
     * @param quantity The quantity to remove
     */
    public void removeItem(Item item, Integer quantity) {
        if(items.containsKey(item)) {
            Integer existingCount = items.get(item);
            Integer newQuantity = existingCount - quantity;
            if(newQuantity < 0) {
                newQuantity = 0;
            }
            items.put(item, newQuantity);
        }
    }

    /**
     * Display on the console items and quantity.
     * Format [Class Name - Brand - Quantity]
     */
    public void displayInventoryOnConsole() {
        // Using lambdas
        items.forEach((item, quantity) ->
                System.out.println((item.getClass().getSimpleName() + " - " + item.getBrand() + ":" + quantity)));
    }

    /**
     * Display on the console items without quantity.
     */
    public void displayItemsOnConsole() {
        // Using lambdas
        items.forEach((item, quantity) -> System.out.println((item)));
    }

}