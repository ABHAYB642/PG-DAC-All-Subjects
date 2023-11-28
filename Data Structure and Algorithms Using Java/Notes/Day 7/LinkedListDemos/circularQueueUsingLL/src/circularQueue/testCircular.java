package circularQueue;

public class testCircular {
		public static void main(String[] args) {
			circualarQueueUsingLL cq=new circualarQueueUsingLL();
			cq.add(10);
			cq.add(20);
			cq.add(30);
			cq.add(40);
			cq.display();
			System.out.println("******************");
			cq.addByPosition(90,2);
			cq.display();
//			
			
		}
	}


