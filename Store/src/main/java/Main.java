import Model.Applicant;
import Model.Cashier;
import Model.Customer;
import Model.Store;
import Enum.Qualification;
public class Main {
    public static void main(String[] args) {
    String path = "/Users/decagon/Desktop/week-two-sq012-musty-codified/src/Product Data - Sheet1.csv";
    Store store = new Store();
    store.fileReader(path);

    Customer customer1 = new Customer();
    customer1.setFirstName("Gideon");
    customer1.setLastName("abel");
    customer1.setWalletBalance(2000000);

    Customer customer2 = new Customer();
    customer2.setFirstName("Mustapha");
    customer2.setLastName("Musa");
    customer2.setWalletBalance(500000);


    customer1.buy(store, "rice", 3);
    customer2.buy(store,"Sugar", 4);


        System.out.println(customer1.getCart());
        System.out.println(customer2.getCart());

        System.out.println(customer1.getWalletBalance());
        System.out.println(customer2.getWalletBalance());

        System.out.println(store.getCustomersList());

    Cashier cashier = new Cashier();
//    cashier.sell(store);
        System.out.println(cashier.sell(store));
        System.out.println(customer1.buy(store, "rice", 3));

    Applicant applicant = new Applicant();
    applicant.setFirstName("Abraham");
    applicant.setLastName("Demilade");
    applicant.setPosition("Cashier");
    applicant.setQualification(Qualification.BSC);
    System.out.println(applicant.applyPosition(applicant));

    }
}
