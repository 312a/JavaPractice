package generics;

public class TestClass {
    public static void main(String[] args) {
        Box<Apple> fruitBox = new Box<>();
        //Box<Burger> burgerBox = new Box<Burger>();
        /*
        * public class Box<T extends Fruit & Eatable> {
        *  Fruit , Eatable 둘다 구현한 자손들만 들어올수있음. 그래서 에러남
        * */
    }
}
