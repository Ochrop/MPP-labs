package com.company;

import com.company.lab2.prob2A.*;
import com.company.lab2.prob2B.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //prob2A
        Student lisa = new Student("Lisa");
        Student degi = new Student("Delgerdalai");
        Student ochiro = new Student("Ochirtulga");

        lisa.getGradeReport().setGrade("A+");
        lisa.printGrade();
        ochiro.printGrade();
        System.out.println(degi.getName() + " has graded " + degi.getGradeReport().getGrade());

        //prob2B
        Order amazonOrder = new Order();
        amazonOrder.addOrder(1, 12.0, 2);
        amazonOrder.addOrder(2, 34.0, 5);

        List<OrderLine> orders = amazonOrder.getAllOrders();

        for (OrderLine order : orders) {
            System.out.print(order.getLineNum() + " " + order.getPrice() + " " + order.getQuantity());
            System.out.println();
        }
    }
}
