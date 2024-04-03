package Lesson_5;

import java.util.Scanner;

public class Homework_Exercise_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int oneNum = a / 10;
        int twoNum = a % 10;

        int sum = oneNum + twoNum;
        int power = sum * sum;
        System.out.println(power);
    }
}
