package arrays;

public class ArrayOfObj {

	public static void main(String[] args) {

		student[] stu;

		stu = new student[5];
		System.out.println(stu.toString());

		stu[0] = new student(1, "test1");
		stu[1] = new student(2, "test1");
		stu[2] = new student(3, "test1");
		stu[3] = new student(2, "test1");
		stu[4] = new student(3, "test1");

		for (int i = 0; i < stu.length; i++) {
			System.out.println("Elements at " + i + " :- " + stu[i].rollno + " Name: " + stu[i].name);
			// System.out.println(stu.toString());

		}

		/*
		 * student[] mystudents = new student[]{new student("Dharma"),new
		 * student("sanvi"),new student("Rupa"),new student("Ajay")};
		 * 
		 * // accessing the elements of the specified array for(student m:mystudents){
		 * System.out.println(m); }
		 */
	}

}
