package stack;

import java.util.Stack;

public class ShortenPathChallenge {
    public static String shortenPath(String path) {
        String result = "";
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String s : arr) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!s.equals(".") && !s.equals("")) {
                stack.push(s);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        while (!stack.isEmpty()) {
            result = "/" + stack.pop() + result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(shortenPath("/foo/../test/../test/../foo//bar/./baz"));
        System.out.println("/foo/bar/baz");
        System.out.println("/../../foo/bar/baz");
        System.out.println("/../../foo/../../bar/baz");
    }
}
