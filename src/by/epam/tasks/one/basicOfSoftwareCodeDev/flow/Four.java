package by.epam.tasks.one.basicOfSoftwareCodeDev.flow;

import java.util.Scanner;

public class Four {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Данная програма определяет пройдетли кирпич в пряоугольное отверстие, \nВведите ширину отверстия, в см:");
        int widthHole = scan.nextInt();
        System.out.println("Введите высоту отверстия, в см.:");
        int heidthHole = scan.nextInt();


        System.out.println("Введите ширину кирпича, в см: ");
        int widthBrick = scan.nextInt();
        System.out.println("Введте высоту кирпича, в см:");
        int heightBrick = scan.nextInt();
        System.out.println("Введите длинну кирпича, в см");
        int lengthBrick = scan.nextInt();

        if(widthBrick > 0 && heightBrick > 0 && lengthBrick > 0 &&widthHole > 0 && heidthHole > 0) {
            if ((widthHole > widthBrick && heidthHole > heightBrick) || (widthHole > heightBrick && heidthHole > widthBrick)) {
                System.out.println("Кирпич проходит, случай 1");
            } else if ((widthHole > widthBrick && heidthHole > lengthBrick) || (widthHole > lengthBrick && heidthHole > widthBrick)) {
                System.out.println("Кирпич проходит, случай 2");
            } else if ((widthHole > heightBrick && heidthHole > lengthBrick) || (widthHole > lengthBrick && heidthHole > heightBrick)) {
                System.out.println("Кирпич проходит, случай 3");
            }else{
                System.out.println("Кирпич не проходит");
            }
        }else{
            System.out.println("это не возможно, либо отсутсвует кирпичь, либо нет отверстия");
        }
    }
}
