package assessmentDay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//An e-commerce website contains a list of items. To mimic the logic of the website, a programmer has a list and each item is in the form of a string array: [name, relevance, price]. After sorting the items by (name:0, relevance:1, price:2), the programmer is trying to find out which are the first X elements of the sorted list.
//
//        O
//
//        Given a list of items, the sort column (0 for sorting by name, 1 for relevance and 2 for price), the sort order (0: ascending 1: descending) and the number of items to be displayed, determine a list of the item names in the specified order and display only the first X.
//
//        Example
//
//        ⚫ there are n=3 items: items = [[item1, 10, 15) [tem2, 3, 41 item3, 17, 811
//
//        Sort them by relevance (sortParameter = 1) in ascending order (sortOrder = 0): items=[[item2, 3, 43 [item1, 10, 151 Btem3, 17, 8] Display only the first 2 elements
//
//        The result is the list [item2, item 11
//
//        Function Description
//
//        Complete the function fetchitemsToDisplay in the editor below
//
//        fetchItemsToDisplay has the following parameter(s):
//
//        string items[n][3) a 2D array of arrays of strings in the form [name, relevance, price) (or a list of lists depending on the programming language)
//
//        int sortParameter an integer, the column of the items to sort on int sortOrder an integer, a ascending and 1 descending int X: an integer, the number of items to display
//
//        Returns:
//
//        string firstXitems: array of the first X item names in the order they are requested
//
//        Constraints
//
//        Os relevance, price 10

public class FetchItemsToDisplay {
    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int X) {
        List<String> ret = new ArrayList<>();
        if (sortOrder == 0) {
            items.sort(Comparator.comparingInt(o -> Integer.parseInt(o.get(sortParameter))));
        } else {
            try {
                items.sort((o1, o2) -> Integer.parseInt(o2.get(sortParameter)) - Integer.parseInt(o1.get(sortParameter)));
            } catch (NumberFormatException e) {
                items.sort((o1, o2) -> o2.get(sortParameter).compareTo(o1.get(sortParameter)));
            }

        }
        for (int i = 0; i < X; i++) {
            ret.add(items.get(i).get(0));
        }
        return ret;
    }
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> item1 = new ArrayList<>();
        List<String> item2 = new ArrayList<>();
        List<String> item3 = new ArrayList<>();
        List<String> item4 = new ArrayList<>();
        Collections.addAll(item1, "owjevtkuyv", "58584272", "62930912");
        Collections.addAll(item2, "rpaqgbjxik", "9425650", "96088250");
        Collections.addAll(item3, "dfbkasyqcn", "37469674", "46363902");
        Collections.addAll(item4, "vjrrisdfxe", "18666489", "88046739");
        Collections.addAll(items, item1, item2, item3,item4);
        System.out.println(fetchItemsToDisplay(items, 2, 1, 3));
    }

}
