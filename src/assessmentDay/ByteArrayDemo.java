package assessmentDay;
import java.io.*;
class ByteArrayDemo {
    public static void main(String[] args) throws IOException {
        byte c1[] = {10,20,30,40,50};
        byte c2[] = {60,70,80,90};
        ByteArrayOutputStream b1 = new ByteArrayOutputStream();
        ByteArrayOutputStream b2 = new ByteArrayOutputStream();
        b2.write(100);
        System.out.println("Out 1: " + b2.size());
        b2.write(c1,0,c2.length);
        System.out.println("Out 2: " + b2.size());
        byte b[] = b2.toByteArray();
        System.out.println("Out 3: " + b.length);
        b2.flush();
        System.out.println("Out 4: " + b2.size());
        b2.reset();
        System.out.println("Out 5: " + b2.size());
        b1.writeTo(b2);
        System.out.println("Out 6: " + b1.size());
    }

}