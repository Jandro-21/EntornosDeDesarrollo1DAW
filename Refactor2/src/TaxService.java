public class TaxService {
    private static final double TAX_RATE = 0.15;

    public double calculateTax(double amount) {
        return amount * TAX_RATE;
    }

    public double calculateTotalWithTax(double amount) {
        return amount + calculateTax(amount);
    }
}
