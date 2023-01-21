package stacks;

import java.util.ArrayList;

public class StackUsingArrayList {

	ArrayList<Integer> stack = new ArrayList<Integer>();

	void push(int value) {
		stack.add(value);
	}

	int pop() {
		if (!stack.isEmpty()) {
			int popValue = stack.get(stack.size() - 1);
			stack.remove(stack.size() - 1);
			return popValue;
		} else {
			System.out.println("empty stack");
			return -1;
		}
	}

	int peek() {
		return stack.get(stack.size() - 1);
	}
	boolean isEmpty() {
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		StackUsingArrayList myStack = new StackUsingArrayList();
		myStack.push(5);
        myStack.push(8);
        myStack.push(2);
        myStack.push(9);
        
        System.out.println("*********************Stack ArrayList Implementation*********************");
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.peek()); // will print 9
        System.out.println(myStack.pop()); // will print 9
        System.out.println(myStack.peek()); // will print 2
        System.out.println(myStack.pop()); // will print 2
	}

}
