package lambda;

import java.util.*;

import static java.util.Collections.*;

public class ex1 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("abc", "aaa", "acc", "ccc");
        List<Integer> list2 = Arrays.asList(2,4,5,1);
        /*
            Integer,String 둘다 Comparable 인터페이스를 상속받고 있어서 compareTo 가 둘다됨
            Comparator
        */

        sort(list1, (a,b)-> a.compareTo(b));
        sort(list2, (a,b)-> a.compareTo(b));

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        /*
        * 객체정렬 람다식으로 표현해봄. 리턴값 1:-1 로 해야 되던데 왜그런지 몰겠음
        * */
        List<Custom> list3 = Arrays.asList(new Custom(5, "다섯번째"), new Custom(1, "첫번째"), new Custom(3, "세번째"));
        System.out.println("list3 = " + list3);
        sort(list3, (a,b)-> a.getNo() > b.getNo() ? 1:
                a.getNo() == b.getNo()? 0:-1);
        for (Custom custom : list3) {
            System.out.println(custom.getNo() + " - " + custom.getName() + custom);
        }
    }
    static class Custom {
        private int no;
        private String name;

        public Custom(int no, String name) {
            this.no = no;
            this.name = name;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
