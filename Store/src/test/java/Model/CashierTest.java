package Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class CashierTest{
    Store store = new Store();
    String path = "/Users/decagon/Desktop/week-two-sq012-musty-codified/src/Product Data - Sheet1.csv";
    Cashier cashier = new Cashier();
    Customer customer1 = new Customer();

    @Test
    void sell_WhenCashierSell_ShouldPrintReceipt(){
//        Arrange
        store.fileReader(path);
        customer1.setFirstName("Gideon");
        customer1.setLastName("Abel");
        customer1.setWalletBalance(2000000);
        customer1.buy(store, "rice", 3);
//        Act
       String result = cashier.sell(store);
//        Assert
        Assertions.assertEquals(result,  "Thank you for your patronage", "Cashier did not print receipt");

    }

}
