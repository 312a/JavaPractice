package lambda;

public class ex3 {

    public static void main(String[] args) {
        // 람다식(익명 객체)을 다루기 위한 참조변수의 타입을 함수형 인터페이스로 함
        MyFunction2 f = (a,b) -> a>b?a:b;
        System.out.println(f.max(6,10));
    }

}

@FunctionalInterface
interface MyFunction2 {
    int max(int a, int b);
}
