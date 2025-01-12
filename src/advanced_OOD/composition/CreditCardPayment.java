package advanced_OOD.composition;

public class CreditCardPayment implements IPaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of ₹"+ amount);
    }
}
