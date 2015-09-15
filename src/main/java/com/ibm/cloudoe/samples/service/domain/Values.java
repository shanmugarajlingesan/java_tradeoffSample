package com.ibm.cloudoe.samples.service.domain;

/**
 * Created by PurushonthamanP on 9/10/2015.
 */
public class Values {

    private float price;
    private YesNoFlag credit_card;
    private YesNoFlag debit_card;
    private YesNoFlag foreign_currency;
    private YesNoFlag over_draft;
    private float interest_percentage_month;
    private String account;
    private AccountType account_type;

    public YesNoFlag getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(final YesNoFlag credit_card) {
        this.credit_card = credit_card;
    }

    public YesNoFlag getDebit_card() {
        return debit_card;
    }

    public void setDebit_card(final YesNoFlag debit_card) {
        this.debit_card = debit_card;
    }

    public YesNoFlag getForeign_currency() {
        return foreign_currency;
    }

    public void setForeign_currency(final YesNoFlag foreign_currency) {
        this.foreign_currency = foreign_currency;
    }

    public YesNoFlag getOver_draft() {
        return over_draft;
    }

    public void setOver_draft(YesNoFlag over_draft) {
        this.over_draft = over_draft;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getInterest_percentage_month() {
        return interest_percentage_month;
    }

    public void setInterest_percentage_month(float interest_percentage_month) {
        this.interest_percentage_month = interest_percentage_month;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public AccountType getAccount_type() {
        return account_type;
    }

    public void setAccount_type(AccountType account_type) {
        this.account_type = account_type;
    }
}
