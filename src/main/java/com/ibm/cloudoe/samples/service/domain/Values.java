package com.ibm.cloudoe.samples.service.domain;

/**
 * Created by PurushonthamanP on 9/10/2015.
 */
public class Values {

    private int price;
    private YesNoFlag credit_card;
    private YesNoFlag debit_card;
    private YesNoFlag foreign_currency;

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

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
}
