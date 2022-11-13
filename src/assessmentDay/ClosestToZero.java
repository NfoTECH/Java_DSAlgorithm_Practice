package assessmentDay;

public class ClosestToZero {
    public int closestToZero(int[] a) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i]) < min) {
                min = Math.abs(a[i]);
                minIndex = i;
            }
        }
        return a[minIndex];
    }

    public static void main(String[] args) {
        ClosestToZero p = new ClosestToZero();
        System.out.println(p.closestToZero(new int[]{-9, 8,2,-5,7}));
    }
}
