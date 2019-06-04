package by.epam.tasks.one.basicOfSoftwareCodeDev.Circle;

import java.util.Scanner;

public class Six {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите символы значенния которых хотите знать (пробелы и заки это тоже символы):");
        String input = scan.nextLine();
        char [] symbol = new char[input.length()];
        int [] symbolCode = new int[input.length()];
        for (int i = 0; i < input.length(); i++){
            symbol[i] = input.charAt(i);
            symbolCode[i] = input.codePointAt(i);
            System.out.println(symbol[i] + " in code: " + symbolCode[i] );

        }

        System.out.println();
    }
}
