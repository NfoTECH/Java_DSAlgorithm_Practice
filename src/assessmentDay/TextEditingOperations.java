package assessmentDay;
//
//You are implementing a class that handles text editing operations, but currently it is not complete and might have some issues. Your task is to refactor it, fix the issues and add the missing parts.
//
//        The following methods should be supported:
//
//        onPressLeft() -the cursor moves left by 1 character. If there are no characters on the left side of the cursor, does nothing.
//
//        onPressRight() - the cursor moves right by 1 character. If there are no characters on the right side of the cursor, does nothing.
//
//        onPressHome ()
//
//        -the cursor moves to the beginning of the text.
//
//        onPressEnd() the cursor moves to the end of the text. onPressDelete () - deletes the character (if there is one)
//
//        adjacent to the right side of the cursor.
//
//        onPressBackspace () - deletes the character (if there is one)
//
//        adjacent to the left side of the cursor.
//
//        onInputCharacter (character) - inserts character on the right side of the cursor
//
//        Example

public class TextEditingOperations {
    class Editor {
        private String text;
        private int cursorPosition;

        public Editor() {
            text = "";
            cursorPosition = 0;
        }

        public void onPressLeft() {
            if (cursorPosition > 0) {
                cursorPosition--;
            }
        }

        public void onPressRight() {
            if (cursorPosition < text.length()) {
                cursorPosition++;
            }
        }

        public void onPressHome() {
            cursorPosition = 0;
        }

        public void onPressEnd() {
            cursorPosition = text.length();
        }

        public void onPressDelete() {
            if (cursorPosition < text.length()) {
                text = text.substring(0, cursorPosition) + text.substring(cursorPosition + 1);
            }
        }

        public void onPressBackspace() {
            if (cursorPosition > 0) {
                text = text.substring(0, cursorPosition - 1) + text.substring(cursorPosition);
                cursorPosition--;
            }
        }

        public void onInputCharacter(char character) {
            text = text.substring(0, cursorPosition) + character + text.substring(cursorPosition);
            cursorPosition++;
        }

        public String getText() {
            return text;
        }
    }


}
