package pt.up.fe.ldts.example3;

public class PercentageDiscount extends Discount {
    public PercentageDiscount(double percentage) {
        super(percentage);
    }

    @Override
    public double applyDiscount(double price) { return price - getDiscount() * price;}
}
