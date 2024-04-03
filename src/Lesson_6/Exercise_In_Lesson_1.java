package Lesson_6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise_Lesson_IN_1 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int[] numbers = {1, 5, 7, 9, 11, 17, 19};
        int[] nums = {19, 8, 43, 1, 25, 26, 19};
        Arrays.sort(nums);
        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.binarySearch(nums, 43));

//        long endTime = System.currentTimeMillis();
//        long executionTime = endTime - startTime;
//        System.out.println("Execution time in milliseconds: " + executionTime);



        int i;
        for (i = 0; i < nums.length; i++){
            if (nums[i] == 43){
                System.out.println(i);
                break;
            }
        }


        // Record the end time
        long endTime = System.nanoTime();

        // Calculate the elapsed time
        long elapsedTime = endTime - startTime;

        // Print the elapsed time in milliseconds
        System.out.println("Elapsed Time: " + elapsedTime + " nanoseconds");
    }
}
