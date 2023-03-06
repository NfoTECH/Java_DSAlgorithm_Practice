package assessmentDay;


// SINGLETON CLASS
public class Singleton {
    private static Singleton instance = null;
    private Singleton() {
        // private so it can not be instantiated from outside the class
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s);
    }
}