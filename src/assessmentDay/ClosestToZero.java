package assessmentDay;

public class ClosestToZero {
    public int closestToZero(int[] ints) {
        int close = Integer.MAX_VALUE;
        int min = 0;
        for (int i = 0; i < ints.length; i++) {
            int curr = Math.abs(ints[i] - 0);
            if (curr < close) {
                close = curr;
                min = ints[i];
            }
            if (curr == close && ints[i] > min) {
                min = ints[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ClosestToZero p = new ClosestToZero();
        System.out.println(p.closestToZero(new int[]{-9, 8,2,-5,7}));
    }
}
