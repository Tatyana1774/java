package homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mainTwo {
    public static void main(String[] args) {
        task_1(); //Напишите метод, который принимает на вход строку (String)
        // и определяет является ли строка палиндромом (возвращает boolean значение).
        task_2(); //Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
        // который запишет эту строку в простой текстовый файл, обработайте исключения.
    }

    private static void task_1() {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(isPalindrom(str));
        in.close();
    }

    public static boolean isPalindrom(String str) {
        return str.equals((new StringBuilder(str)).reverse().toString());
    }

    private static void task_2() {
        createFile();
        writeFile();
    }

    private static void writeFile() {
        String testString = "TEST".repeat(100);
        try (PrintWriter pw = new PrintWriter("C:/Users/Public/Documents/java/src/main/java/homework2/text.txt")){
            pw.write(testString);
            pw.close();
            System.out.println("Запись добавлена");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Запись не работает");
        }
    }

    private static void createFile() {
        File file = new File("C:/Users/Public/Documents/java/src/main/java/homework2/text.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (Exception e){
            System.out.println("Создание файла не работает");
        }
    }


}