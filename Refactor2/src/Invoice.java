public class Invoice {
    private final int invoiceNumber;
    private String customerName;
    private double totalAmount;

    public Invoice(int invoiceNumber, String customerName, double totalAmount) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }


    public int getInvoiceNumber() { return invoiceNumber; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public void applyDiscount(double percentage) {
        this.totalAmount -= (this.totalAmount * percentage / 100);
    }
}