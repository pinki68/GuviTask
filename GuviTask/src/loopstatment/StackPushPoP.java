package exception_collection;

import java.util.Stack;

public class StackPushPoP {

	private Stack<Integer> stack;

	public StackPushPoP() {
		stack = new Stack<>();
	}

	// Method to check if the stack is empty
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	// Method to push an element onto the stack
	public void push(int element) {
		stack.push(element);
		System.out.println("Pushed: " + element);
	}

	// Method to pop an element from the stack
	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty. Cannot pop.");
		} else {
			int poppedElement = stack.pop();
			System.out.println("Popped: " + poppedElement);
		}
	}

	// Method to peek at the top element without removing it
	public void peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty. Cannot peek.");
		} else {
			System.out.println("Top element: " + stack.peek());
		}
	}

	// Method to display the current state of the stack
	public void displayStack() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
		} else {
			System.out.println("Current stack: " + stack);
		}
	}

	public static void main(String[] args) {

		StackPushPoP storeInt = new StackPushPoP();

		// Pushing elements onto the stack
		storeInt.push(10);
		storeInt.push(20);
		storeInt.push(30);

		// Displaying the stack
		storeInt.displayStack();

		// Peeking at the top element
		storeInt.peek();

		// Popping elements from the stack
		storeInt.pop();
		storeInt.pop();

		// Displaying the stack after popping
		storeInt.displayStack();

		// Popping the last element
		storeInt.pop();

		// Trying to pop from an empty stack
		storeInt.pop();

		// Pushing more elements
		storeInt.push(40);
		storeInt.push(50);

		// Final display of the stack
		storeInt.displayStack();
	}

}
