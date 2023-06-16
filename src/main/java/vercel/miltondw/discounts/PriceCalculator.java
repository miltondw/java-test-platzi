package vercel.miltondw.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {
    List<Double> prices= new ArrayList<>();
    private double discount;

    public double getTotal() {
        double result=0;
        for (double price: prices) {
            result +=price;
        }
        double discountTotal= (result*discount)/100;
        return result-discountTotal;
    }

    public void addPrice(double p) {
        prices.add(p);
    }

    public void setDiscount(double d) {
       this.discount=d;
    }
}
