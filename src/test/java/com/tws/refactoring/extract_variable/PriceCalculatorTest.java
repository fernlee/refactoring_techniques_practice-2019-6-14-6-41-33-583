package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yeli on 2019/7/1.
 */
public class PriceCalculatorTest {
    @Test
    public void should_calculate_price_without_discount_when_quantity_is_less_than_500() {
        PriceCalculator calculator = new PriceCalculator();
        assertEquals(2600, calculator.getPrice(500,5), 0.001);
    }

    @Test
    public void should_calculate_price_with_discount_when_quantity_is_more_than_500() {
        PriceCalculator calculator = new PriceCalculator();
        assertEquals(2604.75, calculator.getPrice(501,5), 0.001);
    }

}