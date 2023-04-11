package lesson6;
import java.util.*;
public class main {
    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {

        List<String> data = List.of("Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять", "Десять");
//        List<?> data = List.of(1, 2, 3, 4, 5, 6, 2, 1, 4, 1, 12, 1, 14, 5, 16, 17, 33, 45, 65, 22, 13);
        var dataNew = new ArrayList<>(data);
        Collections.reverse(dataNew);

        System.out.println(new HashSet<>(dataNew));
        System.out.println(new LinkedHashSet<>(dataNew));
        System.out.println(new TreeSet<>(dataNew));
    }
}

