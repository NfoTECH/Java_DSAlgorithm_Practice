package assessmentDay;

//Write a code showing the sum of the following 3x3 matrices (A and B) to produce matrix C

public class Sum3X3Matrix {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 4}, {3, 0, 5}, {2, 1, 6}};
        int[][] B = {{6, 1, 3}, {4, 0, 4}, {5, 1, 2}};
        int[][] C = new int[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
