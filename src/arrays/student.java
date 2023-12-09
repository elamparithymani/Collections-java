package arrays;

public class student {

	public int rollno;
	public String name;

	student(int rollno, String name) {

		this.rollno = rollno;
		this.name = name;

	}

	student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
