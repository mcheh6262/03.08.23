package org.example;

import java.util.ArrayList;

public class Customer implements giftable{
    private int id;
    private String firstName;
    private String lastname;
    private String email;
    private TypeCustomers customerType;
    private int customerDiscount;
    private ArrayList<Order> ListOfFavoriteItems;
    private giftable gift;

    public Customer(int id, String firstName, String lastname, String email, TypeCustomers customerType, int customerDiscount, ArrayList<Order> listOfFavoriteItems, giftable gift) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
        ListOfFavoriteItems = listOfFavoriteItems;
        this.gift = gift;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TypeCustomers getCustomerType() {
        return customerType;
    }

    public void setCustomerType(TypeCustomers customerType) {
        this.customerType = customerType;
    }

    public int getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(int customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    public ArrayList<Order> getListOfFavoriteItems() {
        return ListOfFavoriteItems;
    }

    public void setListOfFavoriteItems(ArrayList<Order> listOfFavoriteItems) {
        ListOfFavoriteItems = listOfFavoriteItems;
    }

    public giftable getGift() {
        return gift;
    }

    public void setGift(giftable gift) {
        this.gift = gift;
    }

    public void newOrder(Order o){
        for (Order item: this.ListOfFavoriteItems) {
            if (item.getItemName().equals(item.getItemName())){
               return;
            }
        }
        this.ListOfFavoriteItems.add(o);
    }
    public void removeItem(Order o) {
        ListOfFavoriteItems.remove(o);
    }
    @Override
    public void openGift(Customer c, giftable g) {
        c.setGift(g);
        System.out.println("you got a new gift! Enjoy!");
    }

    public void takeGift(Customer c) {
        c.setGift(null);

    }



}

}
