package linearQueueUsingLL;

public class testQueue {
	public static void main(String[] args) {
		LinearQueue cq=new LinearQueue();
		cq.add(10);
		cq.add(20);
		cq.add(30);
		cq.add(40);
		cq.display();
		System.out.println("******************");
//		cq.addByPosition(90,0);
		cq.deleteByData(30);
		cq.display();
		
		
	}
}
