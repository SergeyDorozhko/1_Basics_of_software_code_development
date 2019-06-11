package by.epam.tasks.one.basicOfSoftwareCodeDev.linePrograms;

import java.util.Scanner;



public class Four {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число R вида nnn,ddd:");
        double yourNumber = input.nextDouble();

        int beforeComma = (int) yourNumber;

        System.out.println(beforeComma);
        double afterComma = yourNumber - beforeComma;
        afterComma *= 1000;
        afterComma = Math.round(afterComma); // округляем т.к. 654 давало значение 653.
        double newAfterComma = (double)beforeComma / 1000;
        System.out.println(afterComma);
        System.out.println(newAfterComma);
        double result = (int)afterComma + newAfterComma;
        System.out.println("Результат замещения дробной части на целую и целой части на дробную: " + result);




    }
}
