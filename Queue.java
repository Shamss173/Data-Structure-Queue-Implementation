public class Queue {
	int front, rear, size, capacity;
	int array[];

	Queue(int capacity) {
		this.capacity = capacity;
		front = -1;
		rear = -1;
		array = new int[capacity];
		size = 0;
	}

	public void insert(int data) {
		if (rear == capacity - 1)
			System.out.println("Queue Full");
		else {
			System.out.println("Inserting: " + data);
			if (front == -1) {
				array[++rear] = data;
				front++;
				size++;
			} else {
				array[++rear] = data;
				size++;
			}
		}
	}

	int peek() {
		return array[rear];
	}

	void isfull() {
		if (rear == capacity - 1)
			System.out.println("Full");
	}

	void isempty() {
		if (size == 0)
			System.out.println("Empty");
	}

	public void deq() {
		if (size == 0)
			System.out.println("Queue Empty");
		else {
			int x = array[front++];
			System.out.println("Removing: " + x);
			size--;
		}
	}

	public static void main(String arg[]) {
		Queue q = new Queue(5);
		for (int i = 0; i < 6; i++)
			q.insert(i);
		System.out.println("Size: " + q.size);
		System.out.println(q.peek());
		q.deq();
		q.deq();
		q.deq();
		q.deq();
		q.deq();
		q.deq();
		q.insert(8);
		System.out.println("Size: " + q.size);

	}
}
