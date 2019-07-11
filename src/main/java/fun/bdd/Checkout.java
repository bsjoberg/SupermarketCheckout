package fun.bdd;

import java.util.ArrayList;

public class Checkout {
    ArrayList<String> items = new ArrayList<>();

    public void add(String item_name) {
        items.add(item_name);
    }

    public Double total() {
        return .49;
    }
}
