package lab2.prob2B;

public class OrderLine {
    private int lineNum;
    private double price;
    private int quantity;
    private Order order;

    OrderLine(Order order, int lineNum, double price, int quantity) {
        this.order = order;
        this.lineNum = lineNum;
        this.price = price;
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public int getLineNum() {
        return lineNum;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

}
