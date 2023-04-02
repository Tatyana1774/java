package homework3;

import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.max;
import static java.util.Collections.min;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mainThree {
    public static void main(String[] args) {
        task_1(); //Пусть дан произвольный список целых чисел, удалить из него четные числа
        // (в языке уже есть что-то готовое для этого)
        task_2(); //Задан целочисленный список ArrayList. Найти минимальное, максимальное и
        // среднее арифметическое из этого списка.
        task_3(); // Пройтись по списку из задания 2 и удалить повторяющиеся элементы.
    }

    private static void task_1() {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list1);
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами %s\n", list1);
    }

    private static void task_2() {
        Random rnd = new Random();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list2.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list2);
        int max = max(list2);
        int min = min(list2);
        int maxItem = list2.get(0);
        int minItem = list2.get(0);
        int sumItems = 0;
        for (int item : list2) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float) sumItems / list2.size();
        System.out.printf("Максимальный элемент при помощи max %s\n", max);
        System.out.printf("Максимальный элемент %s\n", maxItem);
        System.out.printf("Минимальный элемент при помощи min %s\n", min);
        System.out.printf("Минимальный элемент %s\n", minItem);
        System.out.printf("Сумма элементов %s\n", sumItems);
        System.out.printf("Среднее арифметическое %s\n", average);
    }

    private static void task_3() {
        //Первый вариант, с массивом из 2 задачи, но он не выдает дубли
//        Random rnd = new Random();
//        ArrayList<Integer> list2 = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            int val = rnd.nextInt(-100, 100);
//            list2.add(val);
//        }
        //Второй вариант с новым массивом
        List<Integer> list2 = new ArrayList<>(
                Arrays.asList(1, 10, 7, 1, 4, 9, 2, 2, 3, 7, 10, 3, 9, 3, 4, 5, 5));

        System.out.println("Массив с дубликатами: " + list2);
        List<Integer> newList = list2.stream().distinct().collect(Collectors.toList());
        System.out.println("Массив без дубликатов: " + newList);
    }
}

