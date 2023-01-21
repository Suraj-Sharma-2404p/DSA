package queues;

public class QueueUsingLL {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	static class Queue {
		static Node head = null;
		static Node tail = null;

		static boolean isEmpty() {
			return head == null & tail == null;
		}

		public static void add(int data) {
			Node newNode = new Node(data);
			if (tail == null) {
				tail = head = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;
		}

		public static int remove() {
			if (isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
			int front = head.data;
			if (head == tail) {
				tail = null;
			}
			head = head.next;
			return front;
		}

		public static int peek() {
			if (isEmpty()) {
				System.out.println("empty");
				return -1;
			}
			return head.data;
		}

	}

	public static void main(String[] args) {
		Queue q = new Queue();
		Queue.add(1);
		Queue.add(1);
		Queue.add(1);
		Queue.add(1);
		Queue.add(1);
		Queue.add(1);
		Queue.add(1);
		Queue.add(1);
		while(!Queue.isEmpty()) {
			System.out.println(Queue.peek());
			Queue.remove();
		}
	}
}
