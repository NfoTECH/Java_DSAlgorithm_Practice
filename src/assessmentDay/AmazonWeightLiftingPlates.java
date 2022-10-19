package assessmentDay;

import java.util.List;

public class AmazonWeightLiftingPlates {
    public static int getMinMoves(List<Integer> plates) {
        // Write your code here
        int count = 0;
        int maxWeight = -1;
        int minWeight = Integer.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;
        for (int i = 0; i < plates.size(); i++) {
            if (plates.get(i) > maxWeight) {
                maxWeight = plates.get(i);
                maxIndex = i;
            }
            if (plates.get(i) < minWeight) {
                minWeight = plates.get(i);
                minIndex = i;
            }
        }
        if (minWeight == maxWeight) return 0;
        count += minIndex;
        count += plates.size() - maxIndex - 1;
        if (maxIndex < minIndex) count--;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getMinMoves(List.of(3,2,1)));
    }

}
