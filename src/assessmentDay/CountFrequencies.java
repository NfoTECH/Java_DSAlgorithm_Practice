package assessmentDay;

// Sample Input:
// ["the", "dog", "got", "the", "bone"]

// Sample Output:
// {"the": 2, "dog": 1, "got": 1, "bone": 1}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountFrequencies {
    public static int[] countFrequencies(String[] words) {
        Arrays.sort(words);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    i = j;
                } else {
                    break;
                }
            }
            list.add(count);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"the", "dog", "got", "the", "bone"};
        System.out.println(Arrays.toString(countFrequencies(words)));
    }
}
