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
        Scanner sca = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre a :");
        int a = sca.nextInt();
        Scanner scb = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre b :");
        int b = scb.nextInt();
       // TODO
    }
    @Test
    public void should_substract_two_numbers(){

        // TODO
    }


}
