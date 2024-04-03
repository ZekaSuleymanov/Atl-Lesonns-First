package Lesson_5;

import java.util.Scanner;

public class Homework_Exercise_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && a == c){
            System.out.println(1);
        } else if (a == b) {
            System.out.println(2);
        }else{
            System.out.println(3);
        }
    }
}
