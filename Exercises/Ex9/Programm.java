package Ex9;

public class Programm {
    public static void main(String[] args) {
        System.out.println("Welcome to the shopping center!");

        Customer customer1 = new Customer("Bernd", "bernd-ist-toll@germany.de");
        customer1.addPurchase(new Purchase("Binden", (LoyalDiscount.Discount(customer1) * 200)));
        customer1.addPurchase(new Purchase("FritzKola", (LoyalDiscount.Discount(customer1) * 45)));
        customer1.addPurchase(new Purchase("Bücher", (LoyalDiscount.Discount(customer1) * 120)));
        customer1.addPurchase(new Purchase("Redetraining", (LoyalDiscount.Discount(customer1) * 1200)));

        System.out.println(customer1.getName() + " Total Expenses: " 
        + customer1.totalExpenses() + "€");

    }
}
