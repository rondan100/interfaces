package model.entities;

import java.util.function.DoubleToIntFunction;

public class Invoice {

    private Double bascicPayment;
    private Double tax;

    public Invoice() {
    }

    public Invoice(Double bascicPayment, Double tax) {
        this.bascicPayment = bascicPayment;
        this.tax = tax;
    }

    public Double getBascicPayment() {
        return bascicPayment;
    }

    public void setBascicPayment(Double bascicPayment) {
        this.bascicPayment = bascicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment() {
        return getBascicPayment() + getTax();
    }
}
