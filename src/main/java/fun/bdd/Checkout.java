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
        Double total = 0.0;

        for (Iterator<String> i = items.iterator(); i.hasNext();)
            total += inventory.getPrice(i.next());
        return total;
    }
}
