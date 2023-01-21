package stacks;


public class StackUsingLL {
	Node head;
	
	class Node{
		int value;
		Node next;
	}
	
	public StackUsingLL(Node head) {
		this.head = null;
	}
	public StackUsingLL() {
		super();
		// TODO Auto-generated constructor stub
	}



	//push operation
	void push(int data) {
		Node oldHead = head;
		head = new Node();
		head.value = data;
		head.next = oldHead;
	}
	
	
	//pop operation
	int pop() throws Exception {
		if(head == null) {
			throw new Exception("empty");
		}
		int value = head.value;
		head = head.next;
		return value;
	}
	
	//peek OPeration
	int peek() throws Exception{
		if(head== null) {
			throw new Exception("empty");
		}
		return head.value;
	}
	public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.format(temp.value+"->");
            temp = temp.next;
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		StackUsingLL stackUsingLL = new StackUsingLL();
		stackUsingLL.push(0);
		stackUsingLL.push(2);
		stackUsingLL.push(3);
		stackUsingLL.push(4);
		stackUsingLL.push(5);
		stackUsingLL.toString();
		printList(stackUsingLL.head);
	}
	
	
}
