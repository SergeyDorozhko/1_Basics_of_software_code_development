package by.epam.tasks.one.basicOfSoftwareCodeDev.flow;

import java.util.Scanner;

public class Five {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input x:");

        int x = scan.nextInt();

        double result = (x <= 3 ? Math.pow(x,2) - 3 * x + 9 : 1 / (Math.pow(x,3) + 6));

        System.out.println("При х = " + x +" Значение функции равно:\n"+ result);

    }
}
