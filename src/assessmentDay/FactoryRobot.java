package assessmentDay;

//Sort the packages using the robotic arm of the factory
//
//        Rules
//
//        You work in an automated factory and your objective is to write the method that will dispatch the packages to the correct stack, according to their valume and mass A package is bulky if its volume (Width Height x Length) is greater than or equal to 1,000,000 cm or when
//
//        one of its dimension is greater or equal than 150 cm.
//
//        A package is heavy when its mass is greater or equal than 20 kg
//
//        You must dispatch the packages in the following stacks
//
//        STANDARD standard packages those which are not bulky nor heavy) can be handled normally SPECIAL packages that are either heavy or bulky can't be handied automatically
//
//        REJECTED packages that are both heavy and bulky are rejected
//
//        Implements the method sets(uid, ghs. lngth, nes (units are centimeter for the dimensions and kilogram for the masil This method must return a string the name the stack where the package should go

public class FactoryRobot {
    public static String solve (int width, int height, int length, int mass) {
        // Write your code here
        int volume = width * height * length;
        if (volume >= 1000000 || width >= 150 || height >= 150 || length >= 150) {
            if (mass >= 20) {
                return "REJECTED";
            } else {
                return "SPECIAL";
            }
        } else {
            if (mass >= 20) {
                return "SPECIAL";
            } else {
                return "STANDARD";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solve(100, 100, 100, 20));
    }
}
