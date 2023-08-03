package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class RegularOrder extends OrderSystem implements Discountable{
    public RegularOrder(int id, String name, String deliveryAddress, ArrayList<Order> listOfItemsInTheOrder, int orderCustomer, double orderTotalPrice, String paymentType, LocalDate orderDate) {
        super(id, name, deliveryAddress, listOfItemsInTheOrder, orderCustomer, orderTotalPrice, paymentType, orderDate);
    }
    @Override
public void calculaterDiscount(TypeCustomers R) {
        if (this.getId().equals(this.getOrderCustomer())) {
            getCustomerDiscount();

        }
}

}
