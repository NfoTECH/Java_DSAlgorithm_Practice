package carTutorial;

public class carMain {
    public static void main(String[] args) {
        Car myCar = new Car("V8", "Benz", "Red");
        String carName = myCar.model;
        myCar.move();
        System.out.println(carName);
    }
}
