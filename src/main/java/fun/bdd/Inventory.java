package fun.bdd;

import java.util.HashMap;

public class Inventory {
    HashMap<String, Double> inventory = new HashMap<>();

    public void add(String item_name, double price) {
        inventory.put(item_name, price);
    }

    public Double getPrice(String item_name) {
        return inventory.get(item_name);
    }
}
