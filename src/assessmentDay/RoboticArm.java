package assessmentDay;


//Sort the packages using the robotic arm of the factory.
//
//        ✓ Rules
//
//        You work in an automated factory and your objective is to write the method that will dispatch the packages to the correct stack, according to their volume and mass.
//
//        A package is bulky if its volume (Width x Height x Length) is greater than or equal to than 150 cm.
//
//        1,000,000 cm³ or when one of its dimension is greater or equal A package is heavy when its mass is greater or equal than 20 kg.
//
//        You must dispatch the packages in the following stacks:
//
//        STANDARD packages (those which are not bulky nor heavy) can be handled normally.
//
//        SPECIAL packages that are either heavy or bulky can't be handled automatically.
//
//        REJECTED packages that are both heavy and bulky are rejected.
//
//        Implementation
//
//        Implement the method solve(width, height, length, mass)
//        (units are centimeter for the dimensions and kilogram for the mass).
//        This method must return a string: the name of the stack where the package should go.

public class RoboticArm {
    public static String solve (int width, int height, int length, int mass) {
        int volume = width * height * length;
        if ((volume < 1_000_000 && length < 150 && width < 150 && height < 150) && mass < 20) {
            return "STANDARD";
        }
        if ((volume >= 1_000_000 || length >= 150 || width >= 150 || height >= 150) && mass >= 20) {
            return "REJECTED";
        }
        return "SPECIAL";
    }

    public static void main(String[] args) {
        int width = 100;
        int height = 100;
        int length = 100;
        int mass = 10;
        System.out.println(solve(width, height, length, mass));
    }
}
