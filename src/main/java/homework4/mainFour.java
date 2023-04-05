package homework4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;

public class mainFour {
    public static void main(String[] args) {
        task_1(); //Реализовать консольное приложение, которое:
        //Принимает от пользователя и “запоминает” строки.
        //Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        //Если введено revert, удаляет предыдущую введенную строку из памяти
        task_2(); //Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    }

    private static void task_1() {
        List<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String temp = "";
        while (!temp.toLowerCase().equals("quit")) {
            System.out.println("Введите строку:");
            temp = scanner.nextLine();
            if (temp.toLowerCase().equals("print")) {
                Collections.reverse(linkedList);
                System.out.println(linkedList);
                Collections.reverse(linkedList);
            } else if (temp.toLowerCase().equals("revert")) {
                if (!linkedList.isEmpty()) {
                    linkedList.remove(linkedList.size() - 1);
                } else {
                    System.out.println("Список пуст.");
                }
            } else {
                linkedList.add(temp);
            }
        }
        scanner.close();
    }


    private static void task_2() {
        Random random = new Random();
        List<Integer> randomLinkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            randomLinkedList.add(random.nextInt(1, 10));
        }

        System.out.println("Случайный LinkedList: " + randomLinkedList.toString());

        List<Integer> RevertLinkedList = new LinkedList<>();

        for (int i = randomLinkedList.size() - 1; i >= 0; i--) {
            RevertLinkedList.add(randomLinkedList.get(i));
        }

        System.out.println("Перевёрнутый LinkedList: " + RevertLinkedList.toString());
    }
}