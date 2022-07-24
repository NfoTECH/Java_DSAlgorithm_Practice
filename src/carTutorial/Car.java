package carTutorial;

public class Car {
    boolean steering;
    int seat;
    String engine;
    String model;
    String color;

    public Car(boolean steering, int seat, String engine, String model, String color) {
        this.steering = steering;
        this.seat = seat;
        this.engine = engine;
        this.model = model;
        this.color = color;
    }
    public Car(String engine, String model, String color) {
        this.engine = engine;
        this.model = model;
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Engine: " + engine + "Car Model: " + model + "Color: " + color;
    }

    public void move() {
        System.out.println("This car can move");
    }
}
