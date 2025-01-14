package advanced_OOD.composition;

public class UPIPayment implements IPaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processed UPI payment of ₹"+amount);
    }
}
