package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();

        intStream.forEach(System.out::println);

        intStream = list.stream();
        intStream.forEach(System.out::println); //최종연산을 하고나면 stream이 닫힘, stream은 1회용

        String[] strArr = new String[]{"a", "b", "c"};
//        Stream<String> strStream = Stream.of(strArr);
        Stream<String> strStream = Arrays.stream(strArr);

        strStream.forEach(System.out::print);

        int[] intArr = {1, 2, 3, 4, 5};
        IntStream intStream1 = Arrays.stream(intArr);
        System.out.println(intStream1.sum());
//        System.out.println(intStream1.count());
//        System.out.println(intStream1.average());

        Integer[] intArr2 = {1, 2, 3, 4, 5};
        Stream<Integer> intStream2 = Arrays.stream(intArr2);
        System.out.println(intStream2.count());
    }
}
