package homework1;
/**
 * Java. Домашнее задание 1.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class mainOne {
    /*
    1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
     */
    public static void main(String[] args) {
        task_1();
        //Задать одномерный массив и найти в нем минимальный и максимальный элементы
        task_2();
        //Дан массив nums = [3,2,2,3] и число val = 3.
        //Если в массиве есть числа, равные заданному, нужно перенести
        //эти элементы в конец массива.
        //Таким образом, первые несколько (или все) элементов массива
        //должны быть отличны от заданного, а остальные - равны ему.
    }

    private static void task_1() {
        Integer[] numbers = {8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }

    /*
       2. Дан массив nums = [3,2,2,3] и число val = 3.
    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
    */
    private static void task_2() {
        int[] nums = new int[15];
        int val = 3;
        Random rand = new Random();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(5);
            count = (nums[i] == val) ? (count + 1) : count;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(count);
        switch (count) {
            case 0:
                System.out.println("Нет в массиве");
                break;
            default:
                int l = 0;
                int r = nums.length - 1;
                while (l <= r) {
                    if (nums[l] == val && nums[r] != val) {
                        nums[l] = nums[r];
                        nums[r] = val;
                        l++;
                        r--;
                    } else if (nums[l] == val && nums[r] == val) {
                        r--;
                    } else if (nums[l] != val && nums[r] == val) {
                        l++;
                        r--;
                    } else if (nums[l] != val && nums[r] != val) {
                        l++;
                    }

                }
                System.out.println(Arrays.toString(nums));
                System.out.println("Готово");


        }
    }
}
