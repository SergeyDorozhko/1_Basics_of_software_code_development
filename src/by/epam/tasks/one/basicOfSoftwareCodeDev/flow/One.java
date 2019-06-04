package by.epam.tasks.one.basicOfSoftwareCodeDev.flow;

import java.util.Scanner;

public class One {
    public static void main(String[] args){
        Scanner inputCorner = new Scanner(System.in);
        System.out.println("Для определения вида треугольника введите два угла. \nВведите значение первого угла в градусах:");
        double firstCorner = inputCorner.nextDouble();
        System.out.println("Введите значение второго угла в градусах:");
        double secondCorner = inputCorner.nextDouble();
        double sumOfTwoCorners = firstCorner + secondCorner;
        if (sumOfTwoCorners > 0 && sumOfTwoCorners < 180){
            if (sumOfTwoCorners < 90){
                System.out.println("тупоугольный треугольник");
            }else if (sumOfTwoCorners == 120 && firstCorner == secondCorner){
                System.out.println("правильный треугольник");
            }else if (sumOfTwoCorners == 90 || firstCorner == 90 || secondCorner == 90){
                System.out.println("прямоугольный треугольник");
            }else {
                System.out.println("остроугольный треугольник");
            }
        }else{
            System.out.println("такого треугольника не существует.");
        }
    }
}
