package com.trigyn.paymentservice.model;

public class Payments {
    private Double balance;
    private Double cost;
    private Double gst;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getGst() {
        return gst;
    }

    public void setGst(Double gst) {
        this.gst = gst;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "balance=" + balance +
                ", cost=" + cost +
                ", gst=" + gst +
                '}';
    }
}
