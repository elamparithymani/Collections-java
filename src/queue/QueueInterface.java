package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queueobj = new LinkedList<>();

		queueobj.add("apple");
		queueobj.add("banana");
		queueobj.add("cherry");
		queueobj.offer("dragon fruit");

		System.out.println("Queue:- " + queueobj);

	}

}
