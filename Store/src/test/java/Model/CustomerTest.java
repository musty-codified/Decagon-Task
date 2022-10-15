package Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerTest{
    Store store = new Store();
    String path = "/Users/decagon/Desktop/week-two-sq012-musty-codified/src/Product Data - Sheet1.csv";
//    Cashier cashier = new Cashier();
    Customer customer1 = new Customer();


    @Test
    void buy_WhenCustomerBuy_ShouldAddToToCart(){
//        Arrange
        store.fileReader(path);
        customer1.setFirstName("Gideon");
        customer1.setLastName("Abel");
        customer1.setWalletBalance(2000000);
        customer1.buy(store, "rice", 3);
//         Act
        String result = customer1.buy(store,"rice", 3);
//        Assert
        Assertions.assertEquals(result, "buy successful", "Buy was not successful");
    }


}
