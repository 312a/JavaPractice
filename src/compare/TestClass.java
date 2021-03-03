package compare;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        CompareClass first = new CompareClass(1,"첫번째");
        CompareClass second = new CompareClass(2,"첫번째");

        CompareClass[] list = new CompareClass[2];
        list[0] = first;
        list[1] = second;


        for (CompareClass c : list) {
            System.out.println(c.getVar1() + ":" + c.getVar2());
        }

        Arrays.sort(list,new CompareClass());

        for (CompareClass c : list) {
            System.out.println(c.getVar1() + ":" + c.getVar2());
        }

    }
}
