package advanced_OOD.OOM.coupling.tightCoupling;

public class PaymentProcessor {

    public void processPayment(){
        System.out.println("Payment is processed by paypal");
    }
}

class Order {

    // This will make hard dependency with the PaymentProcessor
    private final PaymentProcessor paymentProcessor = new PaymentProcessor();

    public void placeOrder(){
        paymentProcessor.processPayment();
        System.out.println("Order placed");
    }


}
