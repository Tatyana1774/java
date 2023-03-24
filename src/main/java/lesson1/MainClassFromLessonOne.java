package lesson1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainClassFromLessonOne {
    public static void main(String[] args) {
//        inputNameAndPrint();
        int n = getRandomArrMaxCount(1000);
        System.out.println(n);
    }

    private static void inputNameAndPrint() {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.printf("Привет, %s%n", name);

        int a = 1; //01010111101010101101010101 -- 0
        Integer b = 1; // {0100101011110101010101010} -- null
        List<Integer> list;
    }

    private static int getRandomArrMaxCount(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2); //0-1
//            arr[i] = random.nextInt(3, 10); //3-9
        }

/*        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.println(num);
        }*/

        int count = 0;
        int maxCount = 0;
        for (int num : arr) {
            if (num == 1) {
                count++;

                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        return maxCount;
    }
}
