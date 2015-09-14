package com.ibm.cloudoe.samples.service.domain;

/**
 * Created by PurushonthamanP on 9/10/2015.
 */
public class Values {

    private int price;
    private YesNoFlag credit_card;
    private YesNoFlag debit_card;
    private YesNoFlag foreign_currency;
    private YesNoFlag over_draft;
    private int interest_percentage_month;
    private int popularity_percentage;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInterest_percentage_month() {
        return interest_percentage_month;
    }

    public void setInterest_percentage_month(int interest_percentage_month) {
        this.interest_percentage_month = interest_percentage_month;
    }

    public int getPopularity_percentage() {
        return popularity_percentage;
    }

    public void setPopularity_percentage(int popularity_percentage) {
        this.popularity_percentage = popularity_percentage;
    }

    public AccountType getAccount_type() {
        return account_type;
    }

    public void setAccount_type(AccountType account_type) {
        this.account_type = account_type;
    }
}
