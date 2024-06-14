package Ex9;

public class LoyalDiscount {
    public static Double Discount(Customer customer){
        int discount = 0;
        int historySize = customer.getHistory().size();

        if (historySize != 0) {
            discount = customer.totalExpenses() % customer.getHistory().size();   
        }

        double result = 1 - (discount / 100);

        return result;
    }
}
