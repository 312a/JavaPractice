package wrapper;

import java.util.Optional;

public class Ex1 {
    public static void main(String[] args) {
//        int[] arr = null;
        int[] arr = {};
        System.out.println("arr.length = " + arr.length);

//        Optional<String> opt = Optional.empty();
        Optional<String> opt = Optional.of("abc");
        System.out.println("opt = " + opt);
//        System.out.println("opt = " + opt.get());

        String str = "";

//        try {
//            str = opt.get();
//        }catch (Exception e){
//            str = ""; //예외 발생시 빈문자열 "" 초기화
//        }
        str = opt.orElse("EMPTY");

        System.out.println("str = " + str);
    }
}
