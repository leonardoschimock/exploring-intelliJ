package JavaLogic;

public class MathOperators {
    public static void main (String[] args) {
        double bread = 9.50;
        double cheese = 7.00;
        double sugar = 1.00;
        double discount = 5.00;
        int monthlyDays = 30;

        double total = bread + cheese + sugar;
        double totalWithDiscount = total - discount;
        double dividedTotal = total / 2;
        double monthlyTotal = totalWithDiscount * monthlyDays;

        System.out.println("Receipt = " + monthlyTotal + "£");

    }
}
