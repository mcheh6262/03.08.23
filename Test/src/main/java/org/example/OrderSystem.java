package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class OrderSystem {
    private int id;
    private String name;
    private String deliveryAddress;
    private ArrayList<Order> ListOfItemsInTheOrder;

    private int orderCustomer;
    private double orderTotalPrice;
    private String paymentType;
    private LocalDate orderDate;

    public OrderSystem(int id, String name, String deliveryAddress, ArrayList<Order> listOfItemsInTheOrder, int orderCustomer, double orderTotalPrice, String paymentType, LocalDate orderDate) {
        this.id = id;
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        ListOfItemsInTheOrder = listOfItemsInTheOrder;
        this.orderCustomer = orderCustomer;
        this.orderTotalPrice = orderTotalPrice;
        this.paymentType = paymentType;
        this.orderDate = orderDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public ArrayList<Order> getListOfItemsInTheOrder() {
        return ListOfItemsInTheOrder;
    }

    public void setListOfItemsInTheOrder(ArrayList<Order> listOfItemsInTheOrder) {
        ListOfItemsInTheOrder = listOfItemsInTheOrder;
    }

    public int getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(int orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public double calculateTheOrderTotalPrice() {
        double sum = 0;
        for (Order o: this.ListOfItemsInTheOrder) {
            sum += o.getItemPrice();
        }
        return sum;
    }




    }


