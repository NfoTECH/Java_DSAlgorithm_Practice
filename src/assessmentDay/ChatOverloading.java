package assessmentDay;

//Chat Overloading
//
//        Function overloading or method overloading allows one to create multiple functions of the same name with different implementations.
//
//        Create a class named Chat.
//
//        Add the following variables:
//
//        1. List<String> members - A list of all members in the chat. 2. List<Integer> files- A list of all files in the chat.
//
//        3. HashMap<Integer, String> message - A list of all messages in the chat.
//
//        Add the following methods:
//
//        1. void Chat()- Initializes members, files, message.
//
//        2. Method add which has 3 variations, each with a return type void:
//
//        Variation 1 has a parameter String[] James. This copies the values from names to the list members.
//
//        • Variation 2 has a parameter int[] ids. This copies the values from
//
//        ids to the list files.
//
//        • Variation 3 has 2 parameters: int id and String newMessage This adds the key value pair <id, newMessage> to the map message
//
//        3. Method remove which has 3 variations, each with a return type void
//
//        ⚫ Variation 1 has a parameter String[] names. This removes all the values in names from the list members. If some name does not exist, print Member with name (name) does not exist.
//
//        Variation 2 has a parameter int] ids. This removes all the values in
//
//        If come does not exist, print "File with id (id)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChatOverloading {
    private List <String> members;
    private List <Integer> files;
    private HashMap<Integer, String> message;

    public void Chat () {
        //initializes members, files, message
        members = new ArrayList<>();
        files = new ArrayList<>();
        message = new HashMap<>();
    }

    public void add (String[] names) {
        //copies the values from names to the list members
        for (String name : names) {
            members.add(name);
        }
    }

    public void add (int[] ids) {
        //copies the values from ids to the list files
        for (int id : ids) {
            files.add(id);
        }
    }

    public void add (int id, String newMessage) {
        //adds the key value pair <id, newMessage> to the map message
        message.put(id, newMessage);
    }

    public void remove (String[] names) {
        //removes all the values in names from the list members
        for (String name : names) {
            boolean isRemoved = members.remove(name);
            if (!isRemoved) {
                System.out.printf("Member with name %s does not exist%n", name);
            }
        }
    }

    public void remove (int[] ids) {
        //removes all the values in ids from the list files
        for (int id : ids) {
            int index = -1;
            for (int i = 0; i < files.size(); i++) {
                if (files.get(i) == id) {
                    index = i;
                    break;
                }
            }
            if (index < 0) {
                System.out.printf("File with id %d does not exist%n", id);
            } else {
                files.remove(index);
            }
        }
    }

    public void remove (int id) {
        //removes the key value pair with key id from the map message
        if (message.containsKey(id)) {
            message.remove(id);
        }
        else {
            System.out.printf("Message with id %d does not exist%n", id);
        }
    }

    public static void main(String[] args) {
        ChatOverloading chat = new ChatOverloading();
        chat.Chat();
        chat.add(new String[]{"James", "John", "Mary"});
        chat.add(new int[]{1, 2, 3});
        chat.add(1, "Hello");
        chat.add(2, "Hi");
        chat.add(3, "How are you?");
        chat.remove(new String[]{"John", "Mary"});
        chat.remove(new int[]{1, 2});
        chat.remove(3);
        System.out.println(chat.members);
        System.out.println(chat.files);
        System.out.println(chat.message);
    }
}
