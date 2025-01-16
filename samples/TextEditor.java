package samples;

import java.util.Stack;

public class TextEditor {
    static Stack<String> undo = new Stack<>();

    public static void main(String[] args) {
        //void appendEnd(String)  // hello world
        appendEnd("Hello");
        //System.out.println(undo.peek());
        appendEnd("World");
       // System.out.println(undo.peek());
        read();


    }

    private static void appendEnd(String word) {
        undo.push(word);
    }

    private static void read() {
        String text= "";
        Stack<String> revOrder = new Stack<>();
        while (!undo.empty()) {
            revOrder.push(undo.peek());
            undo.pop();
        }

        if(undo.isEmpty()) {
            System.out.println("All elements has been moved to revOrder stack");
        }

        while (!revOrder.empty()) {
            System.out.print(revOrder.peek());
            System.out.print(" ");
            undo.push(revOrder.peek());
            revOrder.pop();
        }

        if(revOrder.isEmpty()) {
            System.out.println("\nAll elements have been moved back to undo stack");
        }

        System.out.println("Elements present in Undo stack is : " + undo.size());
    }
}
