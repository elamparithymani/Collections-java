package arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { { 1, 2, 5, 7 }, { 2, 4, 4 } };

		System.out.println(arr.length);
		// for(int i=0;i<arr)

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

}
