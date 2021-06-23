package fr.epsi.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    public void init(){
        this.calculator = new Calculator();
        //TODO

    }
    @Test
    public void should_add_two_numbers(){
        int a = 5;
        int b = 3;
        int result = calculator.add(a , b);
       // TODO
    }
    @Test
    public void should_substract_two_numbers(){
        int a = 5;
        int b = 3;
        int result = calculator.substract(a , b);
        // TODO
    }
    @Test
    public void should_multi_two_numbers(){
        int a = 5;
        int b = 3;
        int result = calculator.multi(a , b);
        // TODO
    }
    @Test
    public void should_div_two_numbers(){
        int a = 5;
        int b = 3;
        int result = calculator.div(a , b);
        // TODO
    }

}
