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
        Assertions.assertEquals( 8, result);
       // TODO
    }
    @Test
    public void should_substract_two_numbers(){
        int a = 5;
        int b = 3;
        int result = calculator.substract(a , b);
        Assertions.assertEquals( 2, result);
        // TODO
    }
    @Test
    public void should_multi_two_numbers(){
        int a = 5;
        int b = 3;
        int result = calculator.multi(a , b);
        Assertions.assertEquals( 15, result);
        // TODO
    }
    @Test
    public void should_div_two_numbers(){
        int a = 15;
        int b = 3;
        int result = calculator.div(a , b);
        Assertions.assertEquals( 5, result);
        // TODO
    }
    @Test
    public void should_add_tab(){
        int nmbers[]= {2,4,5,6};
        int result = calculator.add(nmbers);
        Assertions.assertEquals( 0, result);
        // TODO
    }

}
