package by.epam.tasks.one.basicOfSoftwareCodeDev.Circle;


import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number (min 1): ");
        int lastNumber = scan.nextInt();
        int summ = 0;

        if (lastNumber > 0) {
            for (int i = 1; i <= lastNumber; i++) {
                summ += i;
            }
            System.out.println("Result of summ of all nummbers from 1 to input number (include): " + summ);

        }else{
            System.out.println("Your input nnumber < 1, error. \nYour number = " + lastNumber );
        }
    }
}
