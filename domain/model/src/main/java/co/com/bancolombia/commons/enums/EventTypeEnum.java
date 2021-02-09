package co.com.bancolombia.commons.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EventTypeEnum {

    ACCOUNT_RETRIEVED_BASIC("business.deposits.account.d2b.msDeposits.retrievedBasic"),
    ACCOUNT_RETRIEVED_DETAIL("business.deposits.account.d2b.msDeposits.retrievedDetail");

    private final String name;

}
