package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach(i-> System.out.println(i+","));
        System.out.println();

        list.removeIf(i -> i % 2 == 0 || i % 3 == 0);
        System.out.println("list = " + list);

        list.replaceAll(i->i*i);
        System.out.println("list = " + list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        map.forEach((a,b)-> System.out.println(a+":"+b));
        System.out.println();
    }
}
