package by.epam.tasks.one.basicOfSoftwareCodeDev.Circle;

public class Three {
    public static void main(String[] args){
        int summ = 0;
        for(int i = 0; i < 100; i++){
            summ +=Math.pow(i,2);

            System.out.println(summ);
        }
        System.out.println("Summ of all numbers^2 from 0 to 99 = " + summ);
    }
}
