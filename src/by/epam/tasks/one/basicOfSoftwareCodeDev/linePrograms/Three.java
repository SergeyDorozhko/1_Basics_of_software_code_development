package by.epam.tasks.one.basicOfSoftwareCodeDev.linePrograms;

import java.util.Scanner;

public class Three {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        System.out.print("Вычислить значение выражени по формуле: (sin x + cos y)/(cos x - sin y) * tg xy,\nВведите значение x: ");
        double x = input.nextInt();

        System.out.print("Введите значение y: ");
        double y = input.nextInt();


        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.sqrt(x * y);

        System.out.println("При значениях x = " + x + ", y = " + y + "\nРезультат выражения = "+result);

    }

}
