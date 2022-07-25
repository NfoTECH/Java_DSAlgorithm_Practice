package linkedList;

// Write an Append() function which appends one linked list to another. The head of the resulting list should be returned.
//var listA = 1 -> 2 -> 3 -> null
//var listB = 4 -> 5 -> 6 -> null
//append(listA, listB) === 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

public class Append {
    int data;
    Append next = null;

    Append(final int data) {
        this.data = data;
    }

    public Append(int data, Append next) {
        this.data = data;
        this.next = next;
    }

    public static Append append(Append listA, Append listB) {
        if (listA == null && listB == null) return null;
        if (listA == null && listB != null) return listB;
        if (listA != null && listB == null) return listA;

    Append temp = listA;
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = listB;
    return listA;
    }
}
