package com.wecp.medicalequipmentandtrackingsystem.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders") // do not change table name
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // @Temporal(TemporalType.DATE)
    private Date orderDate;
    
    private String status; // Pending, Shipped, Delivered, etc.
    
    private int quantity;
    
    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;

    // Default constructor
    public Order() {}

    // Argument constructor
    public Order(Date orderDate, String status, int quantity, Equipment equipment) {
        this.orderDate = orderDate;
        this.status = status;
        this.quantity = quantity;
        this.equipment = equipment;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
