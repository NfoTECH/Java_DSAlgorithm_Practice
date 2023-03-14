package assessmentDay;
//
//How it works
//
//        The map is represented by a grid of width
//
//        squares wide and
//
//        neight squares
//
//        high.
//
//        10, where the first integer represents the
//
//        The top left square is located at column and the second the row.
//
//        The initial positions of your avatar and the two portals are given by arrays of
//
//        two integers position portal and portale over is a string composed of the characters (top). (down). (right).
//
//        (left).
//
//        If your avatar walks from a given square to a square with a portal, he teleports to the associated portal
//        (and stays on that target square until he makes another move).
//        If a movement would make your avatar move past the end of the map, he does not move nor teleport.
//        Implementation
//
//        Implement the method
//
//        computerfinalPosition(width, height, position,
//
//        portalk, portaim, moves) which:
//
//        takes as inputs the integers width, height
//
//        the integer arrays
//
//        position
//
//        portali, portals and the string moves with:
//
//        0<width <20
//
//        0height <20
//
//        0<= number of characters in moves <= 255 and returns the final position of your avatar as an array of two integers.


import java.util.Arrays;

public class ComputeFinalPosition {

    public static int[] computeFinalPosition(int width, int height, int[] position, int[] portalA, int[] portalB, String moves) {

        // Initializing the position of the avatar and portals
        int[] avatarPosition = position;
        int[] currentPortal = null;

        // Loop through each move
        for (char move : moves.toCharArray()) {
            switch (move) {

                // Move up
                case 'U':
                    if (avatarPosition[1] > 0) {
                        avatarPosition[1]--;
                    }
                    break;

                // Move down
                case 'D':
                    if (avatarPosition[1] < height - 1) {
                        avatarPosition[1]++;
                    }
                    break;

                // Move left
                case 'L':
                    if (avatarPosition[0] > 0) {
                        avatarPosition[0]--;
                    }
                    break;

                // Move right
                case 'R':
                    if (avatarPosition[0] < width - 1) {
                        avatarPosition[0]++;
                    }
                    break;
            }

            // Check if avatar is on a portal
            if (avatarPosition[0] == portalA[0] && avatarPosition[1] == portalA[1]) {
                currentPortal = portalB;
            } else if (avatarPosition[0] == portalB[0] && avatarPosition[1] == portalB[1]) {
                currentPortal = portalA;
            }

            // Teleport avatar if on a portal
            if (currentPortal != null) {
                avatarPosition[0] = currentPortal[0];
                avatarPosition[1] = currentPortal[1];
                currentPortal = null;
            }
        }

        return avatarPosition;
    }

    // Sample usage
    public static void main(String[] args) {
        int[] finalPosition = computeFinalPosition(5, 4, new int[]{0, 0}, new int[]{1, 1}, new int[]{2, 3}, "DRR");
        System.out.println(Arrays.toString(finalPosition)); // Output: [2, 1]
    }
}
