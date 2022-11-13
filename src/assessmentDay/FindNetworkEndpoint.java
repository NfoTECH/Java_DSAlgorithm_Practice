package assessmentDay;

//Implement method FindNetworkEndpoint(startNodeId, fromids, tolds) which should return the last node id of the network found when starting from the node with id startNodeId and following the links of the network.
//
//        In the above example, the endpoint node when starting from node #2 (or any other node) is node #5.
//
//        fromIds and tolds are two arrays of the same length which describe the one-way links of the network (Exomida [1] is linked to tolda [1]). In the example above,
//
//        frontda is:
//
//        [1, 7, 3, 4, 2, 6, 9]
//
//        and tolds is:
//
//        [3, 3, 4, 6, 6, 9, 5]
//
//        In case you run into a loop when traversing the network, the method should return the id of the last node traversed before closing the loop.
//
//        Constraints:
//
//        0<number of links < 10000
//
//        A node cannot be directly linked to itself

public class FindNetworkEndpoint {
    public int findNetworkEndpoint(int startNodeId, int[] fromIds, int[] toIds) {
        int[] visited = new int[fromIds.length];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = -1;
        }
        int index = 0;
        int current = startNodeId;
        while (true) {
            visited[index] = current;
            for (int i = 0; i < fromIds.length; i++) {
                if (fromIds[i] == current) {
                    current = toIds[i];
                    break;
                }
            }
            for (int i = 0; i < visited.length; i++) {
                if (visited[i] == current) {
                    return current;
                }
            }
            index++;
        }
    }

    public static void main(String[] args) {
        FindNetworkEndpoint p = new FindNetworkEndpoint();
        System.out.println(p.findNetworkEndpoint(2, new int[]{1, 7, 3, 4, 2, 6, 9}, new int[]{3, 3, 4, 6, 6, 9, 5}));
    }
}
