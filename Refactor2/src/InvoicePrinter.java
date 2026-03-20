public class InvoicePrinter {
    private final TaxService taxService = new TaxService();

    public void print(Invoice invoice) {
        double tax = taxService.calculateTax(invoice.getTotalAmount());
        double totalWithTax = taxService.calculateTotalWithTax(invoice.getTotalAmount());

        System.out.println("--- Invoice Details ---");
        System.out.println("Number: " + invoice.getInvoiceNumber());
        System.out.println("Customer: " + invoice.getCustomerName());
        System.out.println("Subtotal: " + invoice.getTotalAmount());
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + totalWithTax);
    }
}