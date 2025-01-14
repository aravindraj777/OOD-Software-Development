package advanced_OOD.composition;

public class PaypalPayment implements IPaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of ₹"+amount);
    }
}
