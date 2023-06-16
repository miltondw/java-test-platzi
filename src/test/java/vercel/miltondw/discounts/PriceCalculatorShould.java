package vercel.miltondw.discounts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorShould {
    private  PriceCalculator calculator;
    @Before
    public void setup(){
        calculator = new PriceCalculator();
    }

    @Test
    public void total_zero_when_there_are_prices() {
        assertEquals(0, calculator.getTotal(), 0.01);
    }

    @Test
    public void total_is_the_sum_of_prices() {
        calculator.addPrice(13.04);
        calculator.addPrice(12.12);
        assertEquals(25.16, calculator.getTotal(), 0.01);
    }
    @Test
    public void apply_discount_to_prices() {
        calculator.addPrice(15);
        calculator.addPrice(15);
        calculator.setDiscount(50);
        assertEquals(15, calculator.getTotal(), 0.01);
    }
}