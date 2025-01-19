package advanced_OOD.OOM.coupling.looseCoupling;

public interface PaymentProcessor  {
    void processPayment();
}

class PaypalProcessor implements PaymentProcessor{


    @Override
    public void processPayment() {
        System.out.println("Payment Done with Paypal");
    }
}

class StripeProcessor implements PaymentProcessor{

    @Override
    public void processPayment() {
        System.out.println("Payment Done with Stripe");
    }

}

class Order {

    private PaymentProcessor paymentProcessor;

    Order(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void placeOrder(){
        paymentProcessor.processPayment();
        System.out.println("Order placed through `"+ paymentProcessor.getClass().getSimpleName());
    }

}

class Main{
    public static void main(String[] args) {
        PaymentProcessor paypal = new PaypalProcessor();
        PaymentProcessor stripe = new StripeProcessor();

        Order orderWithPaypal = new Order(paypal);
        orderWithPaypal.placeOrder();

        Order orderWithStripe = new Order(stripe);
        orderWithStripe.placeOrder();

    }
}
