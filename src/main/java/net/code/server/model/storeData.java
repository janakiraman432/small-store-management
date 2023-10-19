package net.code.server.model;

import jakarta.persistence.*;

@Entity
@Table(name="StoreData")
public class storeData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "name")
    private String name;

    @Column(name="quantity")
    private long quantity;

    @Column(name="amount")
    private long amount;

    public storeData() {
    }
    
    public storeData(Long id) {
        this.id= id;
    }

    public storeData(String name, long quantity, long amount) {
        this.name = name;
        this.quantity = quantity;
        this.amount = amount;
    }

    public storeData(long id, String name, long quantity, long amount) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "storeData [id=" + id + ", name=" + name + ", quantity=" + quantity + ", amount=" + amount + "]";
    }
    
}
