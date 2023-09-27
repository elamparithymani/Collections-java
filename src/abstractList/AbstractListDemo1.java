package abstractList;

import java.util.AbstractList;
import java.util.ArrayList;

public class AbstractListDemo1 {
	public static void main(String[] args) {

		// create an empty list with an initial capacity
		AbstractList<Integer> list = new ArrayList<Integer>(5);

		// use add() method to add elements in the list
		list.add(15);
		list.add(20);
		list.add(25);

		// prints all the elements available in list
		for (Integer number : list) {
			System.out.println("Number = " + number);
		}
	}
}
