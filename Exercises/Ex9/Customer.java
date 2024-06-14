package Ex9;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String email;
    private ArrayList<Purchase> history;

    public Customer(String name, String email){
        this.name = name;
        this.email = email;
        this.history = new ArrayList<Purchase>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Purchase> getHistory() {
        return history;
    }

    public void addPurchase(Purchase purchase){
        this.history.add(purchase);
    }

    public int totalExpenses(){
        int result = 0;

        for (Purchase purchase : history) {
            result += purchase.getPrice();
        }

        return result;
    }
}
