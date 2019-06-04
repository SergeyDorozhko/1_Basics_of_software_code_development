package by.epam.tasks.one.basicOfSoftwareCodeDev.linePrograms;
import java.util.Scanner;


public class One {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Задание 1.\nНайдите значения функции: z=((a-3)*b/2)+c. \nВведите значение а: ");

        double a = input.nextDouble();
        System.out.print("Введите значение b: ");
        double b = input.nextDouble();
        System.out.print("Введите значение c: ");

        double c = input.nextDouble();

        double z = ((a-3)*b/2)+c;

        System.out.println("При значениях a = "+a+", b = "+b+", c = "+c+"\nz = "+z);

    }
}
