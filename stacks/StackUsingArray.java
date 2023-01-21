package stacks;

public class StackUsingArray {
	int size;
	int a[] = new int[size];
	int top = -1;
	
	
	public StackUsingArray(int size) {
		this.size = size;
	}
	void push (int data) throws Exception {
		if(top == size -1) {
			throw new Exception("already full");
		}
		top++;
		a[top] = data;
	}
	int pop() throws Exception {
		if(top == -1) {
			throw new Exception("already empty");
		}
		int result = a[top];
		top--;
		return result;
	}
	int peek() throws Exception {
		if(top == -1) {
			throw new Exception("Nothing is in here to peek!!");
		}
		return a[top];
	}
	boolean isEmpty() {
		return top == -1;
	}
	void print(){
	    for(int i = top;i>-1;i--){
	      System.out.print(" "+ a[i]);
	    }
	  }

	public static void main(String[] args) throws Exception {
		StackUsingArray stackUsingArray = new StackUsingArray(5);
		int n = 4;
		for(int i= 0 ;i< n ; i++ ) {
			stackUsingArray.push(i);
		}
		stackUsingArray.print();
	}

}
