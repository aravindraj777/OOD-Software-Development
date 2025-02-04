package mapStruct.enumMapping.payment;

import org.mapstruct.factory.Mappers;

public class PaymentMain {
    public static void main(String[] args) {

        TransactionDto transactionDto = new TransactionDto();
        transactionDto.setTransactionId("ID1");
        transactionDto.setPaymentType(PaymentType.CREDIT_CARD);

        IPaymentMapper paymentMapper = Mappers.getMapper(IPaymentMapper.class);
       TransactionViewDto transactionViewDto = paymentMapper.toViewDto(transactionDto);

        System.out.println(transactionViewDto.getTransactionId());
        System.out.println(transactionViewDto.getPaymentViewType());

    }
}
