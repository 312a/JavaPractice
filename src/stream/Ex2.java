package stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {

//        IntStream intStream = new Random().ints(); // 무한스트림
        IntStream intStream = new Random().ints(5,10);
        intStream.limit(5).forEach(System.out::println);

        IntStream.rangeClosed(5,10).forEach(System.out::println);

        // iterate(T seed, UnaryOperator f) 단항 연산자
        Stream<Integer> intStream2 = Stream.iterate(2, i -> i + 2);
        intStream2.limit(10).forEach(System.out::println);

        Stream<Integer> oneStream = Stream.generate(() -> (int)(Math.random()*100)+1);
        oneStream.limit(10).forEach(System.out::println);
    }
}
