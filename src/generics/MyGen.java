package generics;

import java.util.Iterator;

public class MyGen <T>{
    private T obj;
    public void add(T obj) {
        this.obj = obj;
    }
    T getObj() {
        return obj;
    }

    public static void main(String[] args) {
        MyGen<Integer> m = new MyGen<>();
        m.add(2);
        m.add(3);
        System.out.println(m.getObj());
    }
}

