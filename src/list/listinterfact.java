package list;

import java.util.ArrayList;
import java.util.List;

public class listinterfact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1 = new ArrayList<>();

		// void add(int index, E element);
		l1.add(0, 1);
		l1.add(1, 2);

		List<Integer> l2 = new ArrayList<>();

		l2.add(1, 3);
		l2.add(2, 5);

		System.out.println(l2.toArray());

	}

}
