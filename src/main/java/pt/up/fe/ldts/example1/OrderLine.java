package pt.up.fe.ldts.example1;

public class OrderLine {
    public int quantity;
    public Product product;

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotal() {
        return this.product.getPrice() * quantity;
    }

    public String getLineString() {
        return product.getName() + "(x" + quantity + "): " + getTotal() + "\n";
    }

}
