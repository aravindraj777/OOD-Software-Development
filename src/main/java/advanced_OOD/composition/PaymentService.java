package advanced_OOD.composition;

public class PaymentService {
    private IPaymentMethod paymentMethod;

    public void setPaymentMethod(IPaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount){
        if (paymentMethod == null){
            System.out.println("No payment method selected");
            return;
        }
        paymentMethod.processPayment(amount);
    }
}
