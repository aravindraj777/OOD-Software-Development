package mapStruct.enumMapping.payment;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;

@Mapper
public interface IPaymentMapper {

    @ValueMapping(source = "NETBANKING",target = "NET_BANKING")
//    @ValueMapping(source = "CREDIT_CARD",target = "CARD")
//    @ValueMapping(source = "DEBIT_CARD",target = "CARD")
    @ValueMapping(source = MappingConstants.ANY_REMAINING,target = "CARD")
    @Mapping(source = "paymentType", target="paymentViewType")
    TransactionViewDto toViewDto(TransactionDto transactionDto);
}
