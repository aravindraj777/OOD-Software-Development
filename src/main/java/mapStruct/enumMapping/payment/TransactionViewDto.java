package mapStruct.enumMapping.payment;

public class TransactionViewDto {
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public PaymentViewType getPaymentViewType() {
        return paymentViewType;
    }

    public void setPaymentViewType(PaymentViewType paymentViewType) {
        this.paymentViewType = paymentViewType;
    }

    private String transactionId;
    private PaymentViewType paymentViewType;
}
