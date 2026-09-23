package com.example.spring_ci_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    private final CalculatorService  service = new CalculatorService();

    @Test
    void addpositivenumber(){
        assertEquals(5, service.add(2,3));
    }

    @Test
    void addnegativenumber(){
        assertEquals(-5, service.add(-2,-3));
    }
}
