package Lesson_5;

import java.util.Scanner;

public class Lesson_5_Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 < 1000){
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 < 1000) {
            System.out.println(num2);
        } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 < 1000) {
            System.out.println(num3);
        } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 < 1000) {
            System.out.println(num4);
        }
    }
}
