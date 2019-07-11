package fun.bdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Checkout {
    private final Inventory inventory;
    HashMap<String, Integer> items = new HashMap<>();

    public Checkout(Inventory inventory) {
        this.inventory = inventory;
    }

    public void add(String item_name) {
        // Check if item exists already, if so add to the count
        if (items.containsKey(item_name))
        {
            Integer currentCount = items.get(item_name);
            items.put(item_name, currentCount + 1);
        }
        else
            items.put(item_name, 1);
    }

    public Double total() {
        Double total = 0.0;

        Iterator it = items.entrySet().iterator();

        while(it.hasNext()) {
            // Need to multiply the price by the count of the item
            Map.Entry pair = (Map.Entry)it.next();
            Double item_price = inventory.getPrice(String.valueOf(pair.getKey()));
            Integer item_count = getCount(String.valueOf(pair.getKey()));
            Double totalForItem = item_price * item_count;
            total += totalForItem;
        }
        return total;
    }

    public Integer totalQuantity() {
        Integer totalQuantity = 0;

        Iterator it = items.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            totalQuantity += (Integer)pair.getValue();
        }

        return totalQuantity;
    }

    public Integer getCount(String item_name) {
        return items.get(item_name);
    }
}
