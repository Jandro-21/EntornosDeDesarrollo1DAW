
import java.util.Scanner;


public class InvoiceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nombre = sc.nextLine();
        System.out.println("Cual es tu cantidad?");
        double cantidad = sc.nextDouble();

        Invoice miFactura = new Invoice(101, nombre, cantidad);

        
        TaxService taxService = new TaxService();
        InvoicePrinter printer = new InvoicePrinter();

       
        System.out.println("--- Estado Inicial ---");
        printer.print(miFactura);

     
        miFactura.applyDiscount(10);

        System.out.println("\n--- Después del Descuento (10%) ---");
        
       
        printer.print(miFactura);
        
    
        double totalFinal = taxService.calculateTotalWithTax(miFactura.getTotalAmount());
        System.out.println("\nTotal final a pagar: $" + totalFinal);
    }
}