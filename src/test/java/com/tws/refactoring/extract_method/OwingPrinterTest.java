package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1));
        orders.add(new Order(2));
        orders.add(new Order(3));

        OwingPrinter owingPrinter = new OwingPrinter();
        owingPrinter.printOwing("name", orders);
        assertEquals("*****************************\n" +
                "****** Customer totals ******\n" +
                "*****************************\n" +
                "name: name\n" +
                "amount: 6.0\n", outContent.toString());
    }
}