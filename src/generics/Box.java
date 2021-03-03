package generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit & Eatable> {
    private List<T> list = new ArrayList<>();
    public void add(T item) {
        list.add(item);
    }

}
