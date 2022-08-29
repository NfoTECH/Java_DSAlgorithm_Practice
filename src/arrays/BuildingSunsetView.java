package arrays;

import java.util.*;
public class BuildingSunsetView {
    public static void main(String[] args) {
        int[] buildings = {7,1,7,8,9,8,7,6,5,4,2,5};
        String direction = "EAST";
        System.out.println(sunsetViews(buildings, direction));
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.
        ArrayList<Integer> solution = new ArrayList<Integer>();
        int maxBuilding = 0;
        for(int i = 0; i < buildings.length; i++) {
            if (direction.equalsIgnoreCase("WEST") && buildings[i] > maxBuilding) {
                solution.add(i);
                maxBuilding = buildings[i];
            } else if (direction.equalsIgnoreCase("EAST")) {
                // reverse the array
                for (int j = buildings.length - 1; j >= 0; j--) {
                    if (buildings[j] > maxBuilding) {
                        solution.add(j);
                        maxBuilding = buildings[j];
                    }
                }
            }
        }
        Collections.sort(solution);
        return solution;
    }
}