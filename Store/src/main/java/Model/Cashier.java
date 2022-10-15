package Model;

import Interface.CashierInterface;

public class Cashier extends Staff implements CashierInterface {

    public Cashier() {
    }

    public Cashier(String firstName, String lastName, String gender, String age, String email,
                   long contactNo, String position, String StaffId) {
        super(firstName, lastName, gender, age, email, contactNo, position, StaffId);
    }
    public String sell(Store store) {
        for (Customer cus : store.getCustomersList()) {
            double totalPrice = 0;
            if (!cus.getCart().isEmpty()) {
                for (Product product : cus.getCart()) {
                    totalPrice += (product.getCost() * product.getQuantity());
                }
                dispenseReceipt(cus, totalPrice);
            }

        }
        return "Thank you for your patronage";
    }
    public static void dispenseReceipt(Customer customer, double totalPrice){

        System.out.println("-----------RECEIPT-------------------");
        System.out.println("Name: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("TotalPrice: " + totalPrice);
    }
    @Override
    public String toString() {
        return "Cashier{}";
    }


}
