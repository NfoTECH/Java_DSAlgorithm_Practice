package assessmentDay;

//Nutrition in food can be broken down into proteins, fats, and carbohydrates. Implement the following classes about food and nutrition to complete this challenge:
//
//        1. abstract class Food having the following properties
//
//        double proteins
//
//        double fats
//
//        double carbs
//
//        double tastyScore
//
//        void getMacroNutrients [Abstract Method]
//
//        2. class Egg which extends class Food and has the following properties:
//
//        Constructor to initialize the attributes (proteins fats, and carbs) in the same order.
//
//        int tastyScore = 7
//
//        String type="non-vegetarian"
//
//        void getMacroNutrients => prints("An egg has [this.proteins] gms of protein, [this.fats] gms o fats and [this.carbs] gms of carbohydrates.")
//        3. class Bread which extends class Food and has the following properties:
//
//        Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
//
//        int tastyScore = 8
//
//        String type = "vegetarian"
//
//        void getMacroNutrients => prints(" A slice of bread has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")

public class NutritionChain {
    public abstract class Food {
        double proteins;
        double fats;
        double carbs;
        int tastyScore;
        abstract void getMacroNutrients();
    }
    public class Egg extends Food {
        Egg(double proteins, double fats, double carbs) {
            this.proteins = proteins;
            this.fats = fats;
            this.carbs = carbs;
            this.tastyScore = 7;
        }
        String type = "non-vegetarian";
        void getMacroNutrients() {
            System.out.println("An egg has " + this.proteins + " gms of protein, " + this.fats + " gms of fats and " + this.carbs + " gms of carbohydrates.");
        }
    }
    public class Bread extends Food {
        Bread(double proteins, double fats, double carbs) {
            this.proteins = proteins;
            this.fats = fats;
            this.carbs = carbs;
            this.tastyScore = 8;
        }
        String type = "vegetarian";
        void getMacroNutrients() {
            System.out.println("A slice of bread has " + this.proteins + " gms of protein, " + this.fats + " gms of fats and " + this.carbs + " gms of carbohydrates.");
        }
    }



    public static void main(String[] args) {
        NutritionChain nc = new NutritionChain();
        Egg egg = nc.new Egg(6.3, 5.4, 0.56);
        Bread bread = nc.new Bread(11.0, 1.1, 53.2);
        egg.getMacroNutrients();
        bread.getMacroNutrients();
    }
}
