package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
        final int discountStartQuantity = 500;
        final double discountRate = 0.05;
        double discount = Math.max(0, quantity - discountStartQuantity) * itemPrice * discountRate;

        final double shippingRate = 0.1;
        final double minimumShippingPrice = 100.0;
        double shippingCost = Math.min(quantity * itemPrice * shippingRate, minimumShippingPrice);

        int basePrice = quantity * itemPrice;

        return basePrice - discount + shippingCost;
    }

}
