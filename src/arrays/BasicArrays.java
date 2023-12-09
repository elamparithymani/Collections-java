package arrays;

import java.util.Arrays;

public class BasicArrays {

	public static void main(String[] args) {

		int colors[] = { 1, 2 };

		System.out.println(Arrays.toString(colors));

		// for(int i=0; i<colors.length;i++)

		for (int num : colors) {
			System.out.println(num);
		}
	}

}
