package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex3 {
    public static void main(String[] args) {

        Stream<Student> studentStream = Stream.of(
                new Student("가자바", 2, 200),
                new Student("나자바", 1, 100),
                new Student("다자바", 3, 250),
                new Student("라자바", 2, 270),
                new Student("마자바", 1, 150),
                new Student("바자바", 1, 100),
                new Student("사자바", 3, 280)
        );

        //studentStream.sorted(Comparator.comparing(Student::getBan).reversed()
        studentStream.sorted(Comparator.comparing((Student s)->s.getBan())
                            .thenComparing(Comparator.naturalOrder()))
                    .forEach(System.out::println);

    }


}
class Student implements Comparable<Student> {

    private String name;
    private int ban;
    private int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public int compareTo(Student o) {
        return o.getTotalScore() - this.getTotalScore();
    }

    @Override
    public String toString() {
        return String.format("%s - %d반 - %d점",this.name,this.ban,this.totalScore);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
}
