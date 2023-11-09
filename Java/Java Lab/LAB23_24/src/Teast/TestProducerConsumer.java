package Teast;

import com.demo.beans.Storage;
import Thread.Consumer;
import Thread.Producer;

public class TestProducerConsumer {

	public static void main(String[] args) {
		Storage s=new Storage();
		Producer p=new Producer(s,10);
		Consumer c=new Consumer(s,10);
		p.start();
		c.start();
	}

}
