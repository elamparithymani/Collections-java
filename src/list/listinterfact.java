package list;

import java.util.ArrayList;
import java.util.List;

public class listinterfact {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();

		// void add(int index, E element);
		// to add element in specific index
		l1.add(0, "1");
		l1.add(1, "2");
		// l1.add(3);

		System.out.println(l1);

		List<Integer> l2 = new ArrayList<>();
		l2.add(3);
		l2.add(1, 4);
		l2.add(2, 5);

		// E remove(int index);
		l2.remove(0);

		List<String> list3 = new ArrayList<>();

		// Adding elements to object of List class
		list3.add("Geeks1"); // index 1
		list3.add("Geeks"); // index 3
		list3.add(0, "Geekswithindex"); // index 0
		list3.add(2, "Geekswithindex2"); // index 2

		// E set(int index, E element);
		list3.set(1, "set value");

		System.out.println("Initial ArrayList " + list3.get(0));

		System.out.println(list3);

		// -------searching-----------------

		// int indexOf(Object o);
		System.out.println(list3.indexOf("Geekswithindex"));

		int lastIndex = list3.lastIndexOf("Geeks");
		System.out.println("The last occurrence of 2 is at index " + lastIndex);

		// ----------- Removing Elements------------------------

		// E remove(int index);
		System.out.println(list3.remove(1));

		// boolean remove(Object o);
		System.out.println(list3.remove("Geeks"));

		System.out.println(list3);

		// ----Accessing Elements ---------------------
		String first = list3.get(0);
		String second = list3.get(1);
		String third = list3.get(2);

		System.out.println(first);

		// Checking if an element is present in the List
		boolean isPresent = list3.contains("Geeks");
		System.out.println("Checking if an element is present in the List " + isPresent);

	}

}
