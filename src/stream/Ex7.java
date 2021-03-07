package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Ex7 {
    public static void main(String[] args) {
        Student[] stuArr = {new Student("a",1,10),new Student("b",1,20)
                ,new Student("a",2,50),new Student("a",3,60)
                ,new Student("b",1,80),new Student("b",2,90)
                ,new Student("b",3,100)
        };
        Map<Boolean, List<Student>> list1 = Stream.of(stuArr).collect(partitioningBy(stu -> stu.getBan() >= 2));
        Map<Boolean, Long> count = Stream.of(stuArr).collect(partitioningBy((student) -> student.getTotalScore() > 60,
                counting()));
        Map<Boolean, Map<Boolean, List<Student>>> list2 = Stream.of(stuArr).collect(partitioningBy((student) -> student.getTotalScore() > 60,
                partitioningBy(student -> student.getName().equals("a"))));

        System.out.println("list1 = " + list1.toString());
        System.out.println("count = " + count.toString());
        System.out.println("list2 = " + list2.toString());

        List<Student> successfulB = list2.get(true).get(false);
        System.out.println("successfulB = " + successfulB);
        List<Student> failedB = list2.get(false).get(false);
        System.out.println("failedB = " + failedB);

        Map<Boolean, Map<Boolean, Student>> ok = Stream.of(stuArr).collect(partitioningBy(stu -> stu.getTotalScore() < 60,
                partitioningBy(stu -> stu.getName().equals("a"),
                        collectingAndThen(minBy(comparingInt(Student::getTotalScore)), Optional::get))));
        System.out.println("ok = " + ok.get(true).get(true));

        Map<Boolean, Optional<Student>> maxA = Stream.of(stuArr).collect(partitioningBy(stu -> stu.getName().equals("a"),
                maxBy(comparingInt(Student::getTotalScore))));
        System.out.println("maxA = " + maxA.toString());


    }
}
