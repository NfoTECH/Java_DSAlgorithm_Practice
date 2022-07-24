package generics;

public class MyGenPair<K, V> {
    private K key;
    private V value;

    public MyGenPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public MyGenPair() {

    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        MyGenPair<String, Integer> person = new MyGenPair<>();
        person.key = "Nfo";
        person.value = 32;
        System.out.println(person.key);
        System.out.println(person.value);
        System.out.println(person.getKey());
        System.out.println(person.getValue());
    }
}
// type parameters naming convention
// T - Type
// E - Element
// K - Key
// N - Number
// V - Value
