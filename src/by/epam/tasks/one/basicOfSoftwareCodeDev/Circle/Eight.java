package by.epam.tasks.one.basicOfSoftwareCodeDev.Circle;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Введите два числа через пробел: ");
        String firstNumber = input.next();
        String secondNumber = input.next();

        char [] firstNumberConsistOf = new char[firstNumber.length()];
        char [] secodNumberConsistOf = new char[secondNumber.length()];

        System.out.println("First number consist of: ");
        for (int i = 0; i < firstNumber.length() ; i++ ){
            firstNumberConsistOf[i] = firstNumber.charAt(i);
            System.out.print(firstNumberConsistOf[i] + "; ");
        }
        System.out.println("\nSecond number connsist of: ");
        for(int i = 0; i < secondNumber.length(); i++){
            secodNumberConsistOf[i] = secondNumber.charAt(i);
            System.out.print(secodNumberConsistOf[i] + "; ");
        }

        System.out.print("\nIn both numbers:");

        for(int i = 0; i < firstNumber.length(); i++){

                for (int j = 0; j < secondNumber.length(); j++) {
                    if (firstNumberConsistOf[i] == secodNumberConsistOf[j]) {
                        System.out.print(firstNumberConsistOf[i] + "; ");

                        break;                              //при наличии совпадения дальше не проверяем
                    }
                }
        }


    }
}
