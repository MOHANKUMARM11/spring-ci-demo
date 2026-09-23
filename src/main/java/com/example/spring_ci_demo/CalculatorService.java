package com.example.spring_ci_demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a, int b){
        return a+b;
    }

}
