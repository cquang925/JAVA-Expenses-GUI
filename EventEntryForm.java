package com.company;

import java.util.EventObject;

public class EventEntryForm extends EventObject {
    private String store;
    private String address;
    private String date;
    private String amount;

    public EventEntryForm(Object source) {
        super(source);
    }

    public EventEntryForm(Object source, String store, String address, String date, String amount) {
        super(source);

        this.store = store;
        this.address = address;
        this.date = date;
        this.amount = amount;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
