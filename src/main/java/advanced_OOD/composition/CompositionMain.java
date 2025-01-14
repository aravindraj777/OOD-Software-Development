package advanced_OOD.composition;

public class CompositionMain {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

//        Credit card payment
        paymentService.setPaymentMethod(new CreditCardPayment());
        paymentService.processPayment(2000);

//        UPI
        paymentService.setPaymentMethod(new UPIPayment());
        paymentService.processPayment(3000);

//        Paypal
        paymentService.setPaymentMethod(new PaypalPayment());
        paymentService.processPayment(4000);

    }
}
