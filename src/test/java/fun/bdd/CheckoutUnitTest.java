package fun.bdd;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class CheckoutUnitTest {
    @Test
    public void test_should_give_price_based_on_item_name() {
        Inventory mockInventory = mock(Inventory.class);
        doReturn(.39).when(mockInventory).getPrice("orange");

        Checkout checkout = new Checkout(mockInventory);
        checkout.add("orange");
    }

    @Test
    public void test_should_store_multiple_items() {
        Checkout checkout = new Checkout(new Inventory());
        checkout.add("banana");
        checkout.add("apple");
        Assert.assertEquals(2, checkout.items.size());
    }

    @Test
    public void test_should_have_count_of_two_when_same_item_added_twice() {
        Checkout checkout = new Checkout(new Inventory());
        checkout.add("banana");
        checkout.add("banana");
        Assert.assertEquals(Integer.valueOf(2), checkout.getCount("banana"));
    }

    @Test
    public void test_should_have_more_quantity_than_items_when_adding_same_item() {
        Checkout checkout = new Checkout(new Inventory());
        checkout.add("banana");
        checkout.add("banana");
        Assert.assertEquals(1, checkout.items.size());
        Assert.assertEquals(Integer.valueOf(2), checkout.totalQuantity());
    }

    @Test
    public void test_should_have_more_quantity_than_items_when_different_items() {
        Checkout checkout = new Checkout(new Inventory());
        checkout.add("apple");
        checkout.add("banana");
        checkout.add("apple");
        Assert.assertEquals(2, checkout.items.size());
        Assert.assertEquals(Integer.valueOf(3), checkout.totalQuantity());
    }

    @Test
    public void test_should_count_number_of_each_item() {
    }
}
