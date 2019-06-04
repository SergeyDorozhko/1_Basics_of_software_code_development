package by.epam.tasks.one.basicOfSoftwareCodeDev.Circle;

import java.util.Scanner;

public class Two {
    public static void main( String[] args){
        Scanner scan = new Scanner(System.in);

        int firstX = 0;

        System.out.println("Вычислите значение функции на отрезке [a,b] с шагом h.\nВведите начальние значение, а =");
        firstX = scan.nextInt();
        System.out.println("Введите конечное значение, b=");
        int lastX = scan.nextInt();
        System.out.println("Задайте шаг,h: ");
        int stepH = scan.nextInt();

        while(firstX <= lastX && lastX >= firstX){
            int result = (firstX > 2 ? firstX : -firstX);
            System.out.println("result: " + result);
            firstX += stepH;
        }
        System.out.println("End");

    }
}
