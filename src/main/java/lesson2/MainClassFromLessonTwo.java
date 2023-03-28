package lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainClassFromLessonTwo {
//    public static void main(String[] args) {
//        System.out.println();
//
//        for (int i = 0; i < 10; i++) {
//
//        }
//
//        for (String arg : args) {
//
//        }
//    }

    private static void test() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append("i: ").append(i).append(" -> ").append((char) i).append(System.lineSeparator());
        }
        System.out.println(sb);
    }

    //    private static void stringCompression() {
//        String str = "aaabbbcddr";
//        StringBuilder res = new StringBuilder();
//        int count = 1;
//        for (int i = 0; i < str.length() - 1; i++) {
//            if (str.charAt(i) != str.charAt(i + 1)) {
//                res.append(str.charAt(i));
//                if (count > 1) {
//                    res.append(count);
//                }
//                count = 0;
//            }
//            count++;
//        }
//        res.append(str.charAt(str.length() - 1)).append(count > 1 ? count : "");
//        System.out.println(res);
//    }
    public static void main(String[] args) {
        ex1();
        ex2_1();
        ex2_2();
//        ex5();
    }

    private static void ex1() {
        char firstSymbol = 'A';
        char secondSymbol = '_';
        StringBuilder sb = new StringBuilder();
        int n = 7;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(firstSymbol);
            } else {
                sb.append(secondSymbol);
            }
        }
        System.out.println(sb);
    }

    private static void ex2_1() {
        String longString = "aaaabbbcdd";
        StringBuilder shortStringSB = new StringBuilder();
        char prev = longString.charAt(0);
        char curr = prev;
        int counter = 1;

        for (int i = 1; i < longString.length(); i++) {
            prev = longString.charAt(i - 1);
            curr = longString.charAt(i);
            if (prev != curr) {
                shortStringSB.append(prev);
                shortStringSB.append((counter > 1) ? counter : "");
                counter = 0;
            }
            counter++;
        }
        shortStringSB.append(curr);
        shortStringSB.append((counter > 1) ? counter : "");

        System.out.printf("%s -> %s%n", longString, shortStringSB);
    }

    private static void ex2_2() {
        String longString = "aaaabbbcdd";
        StringBuilder shortStringSB = new StringBuilder();
        char[] charStringArr = longString.toCharArray();
        char curr = 0;
        char next = 0;
        int counter = 0;

        for (int i = 0; i < charStringArr.length - 1; i++) {
            counter++;
            curr = charStringArr[i];
            next = charStringArr[i + 1];
            if (curr != next) {
                shortStringSB.append(curr);
                shortStringSB.append((counter > 1) ? counter : "");
                counter = 0;

            }
        }
        shortStringSB.append(next);
        shortStringSB.append((counter >= 1) ? counter + 1 : "");


        System.out.printf("%s -> %s%n", longString, shortStringSB);
    }
//
//    private static void ex5(String pathDir) {
//        File file = new File(pathDir);
//        if (!file.isDirectory()) {
//            return;
//        }
//
//        String[] dirListNames = file.list();
//
//        StringBuilder sb = new StringBuilder();
//        for (String fileName : dirListNames) {
//            sb.append(fileName).append(System.lineSeparator());
//        }
//
//        try (PrintWriter pw = new PrintWriter("src/main/resources/files/output.txt")) {
//            pw.print(sb);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


    }
