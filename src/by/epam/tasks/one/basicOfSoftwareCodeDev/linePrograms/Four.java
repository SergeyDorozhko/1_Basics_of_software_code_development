package by.epam.tasks.one.basicOfSoftwareCodeDev.linePrograms;

import java.util.Scanner;



public class Four {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число R вида nnn,ddd:");
        String yourNumber = input.nextLine();

        String [] numberByComa = yourNumber.split(",");

        System.out.println("Результат замещения дробной части на целую и целой части на дробную: " + numberByComa[1] + "," + numberByComa[0]);



    }
}
