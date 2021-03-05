package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex5 {
    public static void main(String[] args) {

        String[] strArr = {
          "Ay yo I been on, bitch you been con",
          "Bentley tints on, Fendi prints on",
          "I mean I been Storm, X-Men been formed",
          "He keep on dialing Nicki, like the Prince song"
        };

        Stream<String> strArrStream = Arrays.stream(strArr);
        strArrStream.flatMap(s->Stream.of(s.split(" +")))
                .distinct()
                .map(String::toLowerCase)
                .forEach(System.out::println);

    }
}
