package z.z20_CollectionsFramework;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {

        // The Queue class is a FIFO structure, that means First In-First Out
        // In other words, in this kind of structure the first element that will be removed is the first element that
        // was inserted

        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        stack.add(7);
        stack.add(8);
        stack.add(9);
        stack.add(10);

        System.out.println(stack);

        System.out.println(stack.pop()); // The method pop returns and removes the last elements in the stack

        System.out.println(stack);

        System.out.println(stack.elementAt(1)); // The method elementAt returns the element at the passed position

        System.out.println(stack);

        System.out.println(stack.peek()); // The method peek returns the current element

        System.out.println(stack);

        System.out.println(stack.remove(1)); // The method remove returns and removes an element at the passed position

        System.out.println(stack);

        System.out.println(stack.empty()); // The method empty returns a boolean indicating if the stack is empty
    }

}
