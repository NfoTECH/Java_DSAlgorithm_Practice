package assessmentDay;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.Array;
import java.util.stream.Collectors;
/* model ouput for cut and paste
Member with name __ does not exist
File with id __ does not exist
Message with id __ does not exist
Total number of members in the conversation are __
The names of these members are __
Total number of files in the conversation are __
The messages in the conversation are __
*/
class Chat {
    private List<String> members;
    private List<Integer> files;
    private HashMap<Integer, String> message;

    public Chat(){
        members = new ArrayList<>();
        files = new ArrayList<>();
        message = new HashMap<>();
    }
    public void add(String[] names){
        for (String str: names) {
            members.add(str);
        }
    }
//    public void add(String[] names){
//        members.addAll(Arrays.asList(names));
//    }

    public void add (int[] ids) {
        for(int id:ids){
            files.add(id);
        }
    }

    public void add (int id, String newMessage) {
        message.put(id, newMessage);
    }
    public void remove(String[] names){
        for(String name: names){
            boolean isRemoved = members.remove(name);
            if(!isRemoved){
                System.out.println(String.format("Member with name %s does not exist", name));
            }
        }
    }
    public void remove (int[] ids) {
        for (int id:ids) {
            int index = -1;
            for (int i =0; i<files.size(); i++) {
                if (id == files.get(i)) {
                    index=i;
                    break;
                }
            }
            if (index <0 ){
                System.out.println(String.format("File with id %d does not exist", id));
            } else {
                files.remove(index);
            }
        }
    }
    public void remove(int id) {
        if (message.containsKey(id)) {
            message.remove(id);
        } else {
            System.out.println(String.format("Message with id %d does not exist", id));
        }
    }

    public void printConversation(){
        System.out.println(String.format("Total number of members in the conversation are %d", members.size()));
        System.out.println(String.format("The names of these members are "+ String.join(" ", members)));
        System.out.println(String.format("Total number of files in the conversation are %d", files.size()));
        System.out.print("The messages in the conversation are ");
        String output = "";
        for (String str : message.values()) {
            output += "'" +str+ "' ";
        }
        output = output.trim();
        System.out.print(output);
    }

}

class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] lineArray = sc.nextLine().split(" ");

        Chat newChat = new Chat();
        newChat.add(lineArray);

        lineArray = sc.nextLine().split(" ");

        int[] files = new int[lineArray.length];
        for (int i=0; i < lineArray.length; i++) {
            files[i] = Integer.parseInt(lineArray[i]);
        }
        newChat.add(files);

        String line = sc.nextLine();
        int numberOfMessages = Integer.parseInt(line);

        for (int i=0; i < numberOfMessages; i++) {
            line = sc.nextLine();
            newChat.add(i, line);
        }

        lineArray = sc.nextLine().split(" ");
        newChat.remove(lineArray);

        lineArray = sc.nextLine().split(" ");
        int[] filesRemoved = new int[lineArray.length];
        for (int i=0; i < lineArray.length; i++) {
            filesRemoved[i] = Integer.parseInt(lineArray[i]);
        }
        newChat.remove(filesRemoved);

        lineArray = sc.nextLine().split(" ");
        for (int i=0; i < lineArray.length; i++) {
            newChat.remove(Integer.parseInt(lineArray[i]));
        }

        newChat.printConversation();
    }
}