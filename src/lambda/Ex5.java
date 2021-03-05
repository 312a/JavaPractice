package lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex5 {
    public static void main(String[] args) {
        Function<String, Integer> f = Integer::parseInt;
        Function<String, Integer> f2 = s->Integer.parseInt(s);
        System.out.println("150" + "200");
        System.out.println(f.apply("150") + f.apply("200"));
        System.out.println(f2.apply("150") + f2.apply("200"));

        Supplier<MyClass> s = () -> new MyClass();
        Supplier<MyClass> s2 = MyClass::new;

        MyClass mc = s.get();
        MyClass mc2 = s2.get();

        System.out.println("mc = " + mc);
        System.out.println("mc2 = " + mc2);
    }

    private static class MyClass {
    }
}
