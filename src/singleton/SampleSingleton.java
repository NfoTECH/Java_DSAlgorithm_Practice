package singleton;

import java.lang.reflect.Field;

public class SampleSingleton {
    private static SampleSingleton myInstance;

    private SampleSingleton() {
        if (myInstance != null) throw new RuntimeException("I dare you!");
    }

    public static SampleSingleton lazy() {
        if (myInstance != null) return myInstance;
        myInstance = new SampleSingleton();
        return myInstance;
    }

    public class JSingleton {
        public static SampleSingleton mySingleton() {
            try {
                Field f = SampleSingleton.class.getDeclaredField("myInstance");
                f.setAccessible(true);
                f.set(null, null);
                return SampleSingleton.lazy();
            } catch (Throwable e){
                return null;
            }
        }

        public static void main(String[] args) {
            SampleSingleton one = SampleSingleton.lazy();
            SampleSingleton two = mySingleton();
            System.out.println(one);
            System.out.println(two);

//            if(!Object.equals(one, two))
//                System.out.println("Dare Accepted. It is done.");
        }
    }

}
