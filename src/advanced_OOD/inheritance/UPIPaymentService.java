package advanced_OOD.inheritance;

public class UPIPaymentService extends PaymentService{
    @Override
    void processPayment(double amount) {
        System.out.println("Processed UPI payment of ₹"+amount);
    }
}
