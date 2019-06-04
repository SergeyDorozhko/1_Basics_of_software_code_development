package by.epam.tasks.one.basicOfSoftwareCodeDev.Circle;

import java.math.BigDecimal;

public class Four {
    public static void main(String[] args){
        double result = 1;
        for (int i = 1; i <= 200; i++){
            result *= Math.pow(i,2);
            System.out.println(result);
        }
        System.out.println("The result of multiplication of first 200 numbers, from 1 to 200, is " + result);
    }
}
