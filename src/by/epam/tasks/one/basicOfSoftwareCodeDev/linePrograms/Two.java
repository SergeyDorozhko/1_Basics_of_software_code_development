package by.epam.tasks.one.basicOfSoftwareCodeDev.linePrograms;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Two {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        System.out.print("Вычислить значение выражени по формуле: ((b + sqrt(b^2+4ac))/2a-a^3*c +b^(-2)\nВведите значение a: ");
        double a = input.nextInt();

        System.out.print("Введите значение b: ");
        double b = input.nextInt();

        System.out.print("Введите значение c: ");
        double c = input.nextInt();

        double result = (b+ Math.sqrt(pow(b,2) + 4 * a * c)) / 2 * a - pow(a,3) * c + pow(b,-2); //сокращение защет импорта статического метода

        System.out.println("При значениях a = "+a+", b = "+b+", c = "+c+"\nРезультат выражения = "+result);

    }
}
