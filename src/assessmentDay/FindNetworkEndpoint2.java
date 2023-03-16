package assessmentDay;

import java.util.HashMap;

//Implement method findNetworkEndpoint(startNodeId, fromIds, toIds) which should return the last node id of the network
// found when starting from the node with id startModeId and following the links of the network.
//
//        In the above example, the endpoint node when starting from node #2 (or any other node) is node #5.
//
//        fromIds and toIds are two arrays of the same length
//        which describe the one-way links of the network (fromIds[1]) is linked to (toIds[1]). In the example above,
//
//        fromIds is: [1, 7, 3, 4, 2, 6, 9]
//        toIds is: [3, 3, 4, 6, 6, 9, 5]
//        Output: 5
public class FindNetworkEndpoint2 {
    public static int findNetworkEndpoint (int startNodeId, int[] fromIds, int[] toIds) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < fromIds.length; i++) {
            if (fromIds[i] != toIds[i]) {
                map.put(fromIds[i], toIds[i]);
            }
        }
        int current = map.get(startNodeId);
        int previous = startNodeId;
        HashMap<Integer, Boolean> visited = new HashMap<>();
        while (map.containsKey(current)) {
            if (visited.containsKey(current)) {
                return current;
            }

            visited.put(current, true);
            previous = current;
            current = map.get(current);
        }
        return current;
    }


    public static void main(String[] args) {
        System.out.println(findNetworkEndpoint(2, new int[]{1, 7, 3, 4, 2, 6, 9}, new int[]{3, 3, 4, 6, 6, 9, 5}));
    }
}
