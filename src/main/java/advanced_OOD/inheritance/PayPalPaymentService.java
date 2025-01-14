package advanced_OOD.inheritance;

public class PayPalPaymentService extends PaymentService{
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of ₹"+amount);
    }
}
