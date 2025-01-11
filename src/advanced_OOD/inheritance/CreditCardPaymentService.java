package advanced_OOD.inheritance;

public class CreditCardPaymentService extends PaymentService{
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of ₹"+ amount);
    }
}
