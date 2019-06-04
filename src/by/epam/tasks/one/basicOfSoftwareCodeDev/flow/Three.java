package by.epam.tasks.one.basicOfSoftwareCodeDev.flow;

import java.util.Scanner;

public class Three {
    public static void main(String[] args){


        System.out.println("Введите координаты 3-х точек. \n Введите координату \"Х\" первой точки:");
        Scanner scan = new Scanner(System.in);

        int pointOneX = scan.nextInt();
        System.out.println("Введите координату \"Y\" первой точки:");
        int pointOneY = scan.nextInt();

        System.out.println("Введите координату \"X\" второй точки:");
        int pointTwoX = scan.nextInt();
        System.out.println("Введите координату \"Y\" второй точки:");
        int pointTwoY = scan.nextInt();

        System.out.println("Введите координату \"X\" третьей точки:");
        int pointThreeX = scan.nextInt();
        System.out.println("Введите координату \"Y\" третьей точки:");
        int pointThreeY = scan.nextInt();

        String result;

        if ((pointTwoY - pointOneY) == 0){ //часный случай, уравнения прямой
            result = (pointThreeY == pointOneY ? "точки на одной прямой" : "Точки не на одной прямой");
        }else if ((pointTwoX - pointOneX) == 0){ //часный случай уравления прямой
            result = (pointThreeX == pointOneX ? "точки на одной прямой" : "Точки не на одной прямой");
        }else if (((pointThreeX - pointOneX) / (pointTwoX - pointOneX)) == ((pointThreeY - pointOneY) / (pointTwoY - pointOneY))){ //уравление прямой,если левая часть равна правой, то точки на одной прямой
            result = "точки на одной прямой";
        }else{
            result = "Точки не на одной прямой";
        }

        System.out.println(result);


    }
}
