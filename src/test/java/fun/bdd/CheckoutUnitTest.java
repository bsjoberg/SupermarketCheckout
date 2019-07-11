package fun.bdd;

import org.junit.Assert;
import org.junit.Test;

public class CheckoutUnitTest {
    @Test
    public void test_should_give_price_based_on_item_name() {

    }

    @Test
    public void test_should_store_multiple_items() {
        Checkout checkout = new Checkout(new Inventory());
        checkout.add("banana");
        checkout.add("apple");
        Assert.assertEquals(2, checkout.items.size());
    }
}
