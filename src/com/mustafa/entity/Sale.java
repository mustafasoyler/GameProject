package com.mustafa.entity;

public class Sale {

    private int id;
    private String saleType;
    private String paymentMethod;
    private int saleAmount;

    public Sale() {

    }

    public Sale(int id, String saleType, String paymentMethod, int saleAmount) {
        this.id = id;
        this.saleType = saleType;
        this.paymentMethod = paymentMethod;
        this.saleAmount = saleAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(int saleAmount) {
        this.saleAmount = saleAmount;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", saleType='" + saleType + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", saleAmount=" + saleAmount +
                '}';
    }
}

