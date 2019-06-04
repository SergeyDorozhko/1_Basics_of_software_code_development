package by.epam.tasks.one.basicOfSoftwareCodeDev.Circle;

import java.util.Scanner;

public class Five {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте длинну ряда, длинна равна:");
        int rowLength = scan.nextInt();

        System.out.println("Задайте некоторое число \"е\" для сравнения по модулю:");

        double e = scan.nextDouble();
        double summ = 0;
        for (int n=1; n <= rowLength; n++ ){

            double a = (1 / Math.pow(2, n) + 1 / Math.pow(3, n));
            if (a >= Math.abs(e)){
                summ += a;
                System.out.println("n = " + n);
            }
            System.out.println("a = " + a);
        }
        System.out.println("result " + summ);




    }
}
