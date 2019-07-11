package fun.bdd;

import java.util.ArrayList;
import java.util.Iterator;

public class Checkout {
    private final Inventory inventory;
    ArrayList<String> items = new ArrayList<>();

    public Checkout(Inventory inventory) {
        this.inventory = inventory;
    }

    public void add(String item_name) {
        items.add(item_name);
    }

    public Double total() {
        return inventory.get(items.get(0));
    }
}
