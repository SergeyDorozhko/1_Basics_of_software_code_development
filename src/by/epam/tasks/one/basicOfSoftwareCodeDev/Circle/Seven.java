package by.epam.tasks.one.basicOfSoftwareCodeDev.Circle;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = 0;
        System.out.println("Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. Введите значение m: ");
        m = input.nextInt();
        System.out.println("Введите начение n: ");
        int n = input.nextInt();

        for(; m <= n; m++) {
            for (int i = 2; i < m; i++) {
            if(m % i == 0)  System.out.println(i + " for " + m);

            }
        }
    }




}

