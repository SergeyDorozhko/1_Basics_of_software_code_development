package by.epam.tasks.one.basicOfSoftwareCodeDev.Circle;

import java.util.Arrays;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNumber = input.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = input.nextInt();

        int firstCounter = 0;
        int firstNumberForLength = firstNumber;
        do{
            firstNumberForLength /= 10;
            firstCounter++;
        }while(firstNumberForLength > 0);

        System.out.println("first length " + firstCounter);

        int secondCounter = 0;
        int secondNumberForLength = secondNumber;
        do{
            secondNumberForLength /= 10;
            secondCounter++;
        }while(secondNumberForLength > 0);

        System.out.println("second lenght " + secondCounter);

        int [] firstElemArray = new int[firstCounter];
        for (int i = 0; i < firstElemArray.length; i++){
            firstElemArray[i] = firstNumber % 10;
            firstNumber /= 10;
        }
        System.out.println("first elements " + Arrays.toString(firstElemArray));

        int [] secondElemArray = new int[secondCounter];
        for(int i = 0; i < secondElemArray.length; i++) {
            secondElemArray[i] = secondNumber % 10;
            secondNumber /= 10;
        }
        System.out.println("second elements " + Arrays.toString(secondElemArray));


        System.out.println("Elements which contains in both numbers: ");
        for(int i = 0; i < firstElemArray.length; i++){
            for (int j = 0; j < secondElemArray.length; j++){
                if(firstElemArray[i] == secondElemArray[j]){
                    System.out.print(firstElemArray[i] + ", ");
                }
            }
        }
        /*
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
*/

    }
}
