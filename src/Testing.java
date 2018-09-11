import javax.swing.JOptionPane;


public class Testing {
	public static void main(String[] args) {
		
		Queue q = new ArrayQueue(4); 
		
		// test to enque while queue is full
		JOptionPane.showMessageDialog(null, "About to enqueue words onto queue: \nThe end is nigh! or not");
		q.enqueue("The");
		q.enqueue("end");
		q.enqueue("is");
		q.enqueue("nigh!");
		q.enqueue("or");
		q.enqueue("not");
		
		//test to deque while queue is empty
		 //empty queue
		JOptionPane.showMessageDialog(null, "About to dequeue the words ...");
		while(! q.isEmpty()) {
			String word = (String) q.dequeue(); // Note: have to cast Objects popped to String
			JOptionPane.showMessageDialog(null, "Word dequeued: " + word);
		} q.dequeue();
		
		//Equeueing only null values
		q.enqueue(null);
		q.enqueue(null);
		q.enqueue(null);
		q.enqueue(null);
		q.enqueue("dhdh");
		
		
		//Dequeueing null values
		JOptionPane.showMessageDialog(null, "About to dequeue the words ...");
		while(! q.isEmpty()) {
			 q.dequeue(); // Note: have to cast Objects popped to String
			
		} 
		
		//enqueueing extreme values
		q.enqueue(1000000000);
		q.dequeue();
		q.enqueue(-1000000000);
		q.dequeue();
		q.enqueue("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhh!!!!!!!");
		while(! q.isEmpty()) {
			String word = (String) q.dequeue(); // Note: have to cast Objects popped to String
			JOptionPane.showMessageDialog(null, "Word dequeued: " + word);
		} 
		
		//Enqueue to capacity, dequeue two then enqueue one
		q.enqueue("The");
		q.enqueue("end");
		q.enqueue("is");
		q.enqueue("nigh!");
		
		q.dequeue();
		q.dequeue();
		
		q.enqueue("canm");
		

		
		
		System.exit(0);
	}

}
