package com.ibm.cloudoe.samples.service.domain;

import com.ibm.cloudoe.samples.service.domain.AccountType;

/**
 * Created by PurushonthamanP on 9/10/2015.
 */
public class FormRequest {

    private AccountType accountType;
    private boolean debitCard;
    private boolean creditCard;
    private boolean foreignCurrency;
    private String description;

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(final AccountType accountType) {
        this.accountType = accountType;
    }

    public boolean isDebitCard() {
        return debitCard;
    }

    public void setDebitCard(final boolean debitCard) {
        this.debitCard = debitCard;
    }

    public boolean isCreditCard() {
        return creditCard;
    }

    public void setCreditCard(final boolean creditCard) {
        this.creditCard = creditCard;
    }

    public boolean isForeignCurrency() {
        return foreignCurrency;
    }

    public void setForeignCurrency(final boolean foreignCurrency) {
        this.foreignCurrency = foreignCurrency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }
}
