package abstractList;

//Java program to demonstrate
//addAll() method
//for String value

import java.util.*;

public class addallAbstractList {
	public static void main(String[] argv) throws Exception {

		try {

			// Creating object of AbstractList<String>
			AbstractList<String> arrlist1 = new ArrayList<String>();

			// Populating arrlist1
			arrlist1.add("A");
			arrlist1.add("B");
			arrlist1.add("C");
			arrlist1.add("D");
			arrlist1.add("E");

			// print arrlist1
			System.out.println("Original ArrayListlist : " + arrlist1);

			// Creating another object of AbstractList<String>
			AbstractList<String> arrlist2 = new ArrayList<String>();

			// Populating arrlist2
			arrlist2.add("X");
			arrlist2.add("Y");
			arrlist2.add("Z");

			// print arrlist2
			System.out.println("ArrayList elements " + "to be added : " + arrlist2);

			// adding the specified element
			// starting from index 2
			// using addAll() method
			boolean value = arrlist1.addAll(2, arrlist2);

			// print the value
			System.out.println("Operation successful : " + value);

			// print the new arrlist
			System.out.println("New ArrayList : " + arrlist1);
		}

		catch (NullPointerException e) {
			System.out.println("Exception thrown : " + e);
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}
