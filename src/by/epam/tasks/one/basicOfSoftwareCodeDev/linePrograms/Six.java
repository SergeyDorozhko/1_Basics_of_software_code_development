package by.epam.tasks.one.basicOfSoftwareCodeDev.linePrograms;

import java.util.Scanner;

public class Six {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты (x,y).\nВведите значение x:");
        int x = scan.nextInt();
        System.out.println("Введте значене y:");
        int y = scan.nextInt();

        boolean indicator=false;

        if ((x >= -2 && x <= 2 && y >= -3 && y <= 4) || ((x >= -4 && x <= 4 && y >= -3 && y <= 0) )){
            System.out.println(indicator=true);
        }else{
            System.out.println(indicator);
        }




    }
}
