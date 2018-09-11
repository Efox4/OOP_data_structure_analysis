import javax.swing.JOptionPane;



public class ArrayQueue implements Queue 
{
	 protected Object Q[];				 
	 protected int rear = -1;			
	 protected int front = 0;
	 protected int capacity; 			
	 public static final int CAPACITY = 1000;
	 private int size = 0;
	   
	 public ArrayQueue() {
		   
		   this(CAPACITY);
	 }

	 public ArrayQueue(int cap) {
		  
		  capacity = (cap > 0) ? cap : CAPACITY;
		  Q = new Object[capacity]; 
	 }
	 
	 public void enqueue(Object n)
	 {
		 if (isFull()) {
			 JOptionPane.showMessageDialog(null, "Cannot enqueue object; queue is full.");
			 return;
		 }
		 JOptionPane.showMessageDialog(null, "enqueuing");
		 rear = (rear + 1) % capacity;//changed code
		 Q[rear] = n;
		 size++;
		 
	 }
	 
	 public Object dequeue()
	 {
		
		 if (isEmpty()) {
			 JOptionPane.showMessageDialog(null, "Cannot dequeue anything; queue is empty.");
			 return null;
		 }
		//changed code
		 Object toReturn = Q[front];
		 JOptionPane.showMessageDialog(null, "dequeueing " + Q[front]);
		 Q[front] = null;
		 front = (front + 1) % capacity;
		 size--;
		 
		 
		 
		 return toReturn;
	 }
	 
	 public boolean isEmpty()  {
		 
	     return(size == 0); //(rear == front - 1);//changed code
	 }
	 
	 public boolean isFull() {
		 if(isEmpty())return false;
		 return(size >= capacity);//(rear - front == -1 || rear - front == capacity - 1 );//changed code
	 }
	 
	 public Object front()
	 {
		 if (isEmpty())
			 return null;
		 
		 return Q[front];//changed code
	 }
}