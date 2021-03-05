package stream;

import java.io.File;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        File[] fArr = {new File("Ex1.java"),new File("Ex1.chu")
        ,new File("Ex2.java"),new File("Ex1.asd.txt"),new File("Ex1.txt")};

        Stream<File> fileStream = Stream.of(fArr);

        Stream<String> fileNameStream = fileStream.map(File::getName);

        fileNameStream.filter(n->n.lastIndexOf('.') != -1)
                .peek(s->System.out.printf("filename = %s \n",s))
                .map(n->n.substring(n.lastIndexOf('.')+1))
                .peek(s->System.out.printf("extension = %s \n",s))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);

        System.out.println();
    }
}
