package by.epam.tasks.one.basicOfSoftwareCodeDev.Circle;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Four {
    public static void main(String[] args){
       /*
        double result = 1;
        for (int i = 1; i <= 200; i++){
            result *= Math.pow(i,2);
            System.out.println(result);
        }
        System.out.println("The result of multiplication of first 200 numbers, from 1 to 200, is " + result);
        */


        BigInteger result = new BigInteger("1");  //для вывода результата

        BigInteger number = new BigInteger("1"); // начальное начение числа
        BigInteger iteration = new BigInteger("1"); // для проведения итерации чисел BigIntegeer

        for(int i=1; i<=200; i++){
            number = number.add(iteration);         //провкдкние итерации на каждом шаге цикла
            result = result.multiply(number.pow(2)); //умноение предыдущего результата на квадрат следующего числа
  //          System.out.println(result);
        }
        System.out.println("The result of multiplication of first 200 numbers, from 1 to 200, is " + result);
    }
}
