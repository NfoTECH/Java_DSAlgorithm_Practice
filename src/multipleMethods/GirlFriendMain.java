package multipleMethods;

import java.util.Scanner;

public class GirlFriendMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // Get input from user
        GirlFriend girlfriendObject = new GirlFriend();
        System.out.println("Enter the name of first girlfriend here: ");

        girlfriendObject.setName(input.nextLine());     // Set the user's input to girlName in GirlFriend class
        girlfriendObject.saying();     // Call the saying method, returning the girlName which is now user's input
    }
}
