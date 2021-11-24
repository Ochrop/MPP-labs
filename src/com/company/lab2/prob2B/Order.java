package com.company.lab2.prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private List<OrderLine> orderLine = new ArrayList<>();
    private int orderNum;

    public Order() {
        this.orderDate = LocalDate.now();
        orderLine.add(new OrderLine(this,0,0.0,0));
    }

    public void addOrder(int lineNum, double price, int quantity) {
        if (orderLine.get(0).getLineNum() == 0) {
            orderLine.set(0, new OrderLine(this, lineNum, price, quantity));
        } else {
            orderLine.add(new OrderLine(this, lineNum, price, quantity));
        }
    }

    public int getOrderNum() {
        return orderNum;
    }

    public List<OrderLine> getAllOrders() {
        return orderLine;
    }
}
