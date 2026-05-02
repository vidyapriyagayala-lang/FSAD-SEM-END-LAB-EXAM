package com.klef.fsad.exam;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payment_table")
public class Payment 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String status;
    private double amount;
    private String method;

    public Payment() {}

    public Payment(String name, Date date, String status, double amount, String method) {
        this.name = name;
        this.date = date;
        this.status = status;
        this.amount = amount;
        this.method = method;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }

    @Override
    public String toString() {
        return "Payment [id=" + id + ", name=" + name + ", date=" + date +
               ", status=" + status + ", amount=" + amount + ", method=" + method + "]";
    }
}
