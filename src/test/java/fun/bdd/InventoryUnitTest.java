package fun.bdd;

import org.junit.Assert;
import org.junit.Test;

public class InventoryUnitTest {
    @Test
    public void test_should_retrieve_price_given_an_item() {
        Inventory inventory = new Inventory();
        inventory.add("banana", .29);
        Assert.assertEquals(Double.valueOf(.29), inventory.getPrice("banana"));
    }
}
