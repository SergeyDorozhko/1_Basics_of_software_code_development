package by.epam.tasks.one.basicOfSoftwareCodeDev.linePrograms;

import java.util.Scanner;

public class Five {
    public static void main(String[] args){
        Scanner inputSeconds = new Scanner(System.in);
        System.out.print("Введите секунды для перевода их в формат HHч ММмин SSс:");

        int seconds = inputSeconds.nextInt();
        int minutes = seconds/60;
        int hour = minutes/60;
        System.out.println(seconds +" секунд, это " + hour + "ч " + (minutes - hour * 60) + "м " + (seconds - minutes * 60) + "c");
    }
}
