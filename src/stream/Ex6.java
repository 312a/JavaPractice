package stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex6 {
    public static void main(String[] args) {
        Student[] stArr = {new Student("a",1,20)
                ,new Student("a",2,50),new Student("a",3,70)
                ,new Student("b",1,70),new Student("b",2,70)
                ,new Student("b",3,70)
        };

        Stream<Student> studentStream = Stream.of(stArr);
        studentStream.filter(stu->stu.getBan() <= 2).distinct().forEach(stu-> System.out.println(stu.toString()));

        String[] strArr = {"Inheritance", "Java", "Lambda", "stream", "OptionalDouble", "IntStream", "count", "sum"};

        Stream.of(strArr)
                .sequential()
//                .parallel()
//                .forEachOrdered(System.out::println); // 병렬도 순서보장
                .forEach(System.out::println); // 병렬에서는 순서보장 x

        boolean noEmptyStr = Stream.of(strArr)
                .noneMatch(s -> s.length() == 0);
        Optional<String> find = Stream.of(strArr)
                .filter(s -> s.charAt(0) == 'S' || s.charAt(0) == 's').findFirst();

        System.out.println("noEmptyStr = " + noEmptyStr);
        System.out.println("find = " + find.orElse("not found"));

//        Stream<Integer> integerStream = Stream.of(strArr).map(String::length);
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0,(a,b)->a+1);
        int sum = intStream2.reduce(0, (a, b) -> a + b);
//        OptionalInt max = intStream3.reduce(Integer::max);
//        OptionalInt min = intStream4.reduce(Integer::min);
        OptionalInt max = IntStream.empty().reduce(Integer::max);
        OptionalInt min = IntStream.empty().reduce(Integer::min);

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
        System.out.println("max = " + max.orElse(0));
        System.out.println("min = " + min.orElse(Integer.MAX_VALUE));


    }
}
