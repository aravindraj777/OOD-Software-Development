package advanced_OOD.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        PaymentService paymentService;

//        Credit Card payment
        paymentService = new CreditCardPaymentService();
        paymentService.processPayment(2000);

//        Paypal Payment
        paymentService = new PayPalPaymentService();
        paymentService.processPayment(3000);

//        UPI payment
        paymentService = new UPIPaymentService();
        paymentService.processPayment(4000);

    }
}
