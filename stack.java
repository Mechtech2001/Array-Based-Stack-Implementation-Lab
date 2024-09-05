/** Program description
 * @author [Tommy Wells] 
 * @version 1.0
 * @since 9-4-2024
 * 
*/
/*  
* OS: [Windows]
* IDE: [eclipse]
* Copyright : This is my own original work 
* based on specifications issued by our instructor
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or
* unmodified, nor used generative AI as a final draft. 
* I have not given other fellow student(s) access to my program.
*/
package stack.lab;

public class stack {
	// Members
	private int top; // defines where the top of the stacks starts.
	private int maxSize; // sets the max size of the stack
	private String stackItems[];

	public stack() {
		this.maxSize = 5;
		this.top = -1;
		this.stackItems = new String[maxSize];
	}

	/**
	 * @param maxSize - sets maximum size of the stack
	 */
	public stack(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		this.stackItems = new String[maxSize];
	}

	/**
	 * @return
	 */
	public boolean isFull() {
		return top == maxSize - 1; /*
									 * in order to test the isfull() method you would have to fill the stack up to
									 * the max to see if it returns true when filled up and then test it while the
									 * stack is empty or partly filled to see if it returns false
									 */
	}

	/**
	 * @return
	 */
	public boolean isEmpty() {
		return top == -1;
	}

	/**
	 * @return
	 */
	public int size() {

		return top + 1;

	}

	/**
	 * @return
	 * @throws StackEmptyException
	 */
	public String peek() throws StackEmptyException {
		if (!this.isEmpty()) // if statement is necessary since it checks if the stack is empty. You can't use peek on an empty stack.
			return stackItems[top];
		throw new StackEmptyException();
	}

	/**
	 * @return
	 */
	public String pop() throws StackEmptyException {
		if (!this.isEmpty()) 
		throw new StackEmptyException();
		String item = stackItems[top];
		stackItems[top--] = null;
		return item;
	}

	

	/**
	 * 
	 */
	public void push(String item) throws StackFullException {
		 if (this.isFull()) {
	            throw new StackFullException();} //if statement to check if the stack is full 
	        stackItems[top++] = item; } // adds item to the top of the stack by increasing the top value by 1 while adding the item

	

	public String printStackUp() throws StackEmptyException {
		if(this.isEmpty()) {
			throw new StackEmptyException();
		}
		
		StringBuilder stackString1 = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            stackString1.append(stackItems[i]);
        }
        return stackString1.toString();
        }
	
	}


