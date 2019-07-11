package fun.bdd;

import java.util.HashMap;

public class Inventory {
    HashMap<String, Double> inventory = new HashMap<>();
    public void add(String item_name, double price) {
        inventory.put(item_name, price);
    }

    public Double get(String item_name) {
        return 0.0;
    }
}
