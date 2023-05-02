package assessmentDay;
//
//port java.io."; port java.util."
//
//        port java.util.concurrent. ThreadLocalRandom;
//
//class FastCar
//
//{
//
//    public static void main(String[] args)
//
//    This will create a list of 1000 cars with random speed between 55 and 228
//
//    List<Car> carlist=new ArrayList<>(); for (int i = 0; i < 1000; i++) carlist.add(new Car(ThreadLocalRandom.current.nextDouble(55, 220)));
//
//}
//
//    Car fastestCar - findFastestCar(carlist);
//
//        System.out.println("FASTEST CAR TOP SPEED fastestCar.getSpeed()); }
//
//// TODO: Implement this method
//
//private static Car FindFastestCar(List<Car> carlist)
//
//        Fastest Car
//
//        1. Read the following code and fill in the missing pieces necessary to make it compile, run and produce the correct result.
//
//        2. List the test scenarios, in comments, that you would execute for the findFastestCar() method.


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

class FastCar {

    public static void main(String[] args) {
        // This will create a list of 1000 cars with random speed between 55 and 220
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            carList.add(new Car(ThreadLocalRandom.current().nextDouble(55, 220)));
        }

        Car fastestCar = findFastestCar(carList);

        System.out.println("FASTEST CAR TOP SPEED: " + fastestCar.getSpeed());
    }

    private static Car findFastestCar(List<Car> carList) {
        Car fastestCar = carList.get(0);
        for (int i = 1; i < carList.size(); i++) {
            Car currentCar = carList.get(i);
            if (currentCar.getSpeed() > fastestCar.getSpeed()) {
                fastestCar = currentCar;
            }
        }
        return fastestCar;
    }

}

class Car {
    private double speed;

    public Car(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
}

//    And here are some test scenarios you could execute for the findFastestCar() method:
//
//        Test with a list containing only one car with speed 100. The expected result is that the fastest car returned by the method is the one with speed 100.
//        Test with a list containing cars with different speeds but all of them below 55. The expected result is that the method returns the first car in the list.
//        Test with a list containing cars with different speeds but all of them above 220. The expected result is that the method returns the last car in the list.
//        Test with a list containing multiple cars with the same speed. The expected result is that the method returns the first car in the list with that speed.
//        Test with a list containing cars with random speeds. The expected result is that the method returns the car with the highest speed in the list.