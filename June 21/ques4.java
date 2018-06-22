package june21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ques4 {

	public static void main(String[] args) {
		ArrayList<Student> myList = new ArrayList<Student>();
		myList.add(new Student(20, "Mayank"));
		myList.add(new Student(14, "Sumant"));
		myList.add(new Student(18, "Adi"));
		myList.add(new Student(31, "Snoop Dog"));

		// Comparing on the basis of Name
		studentName n = new studentName();
		Collections.sort(myList, n);
		System.out.println("Sorting on the basis of Name : ");
		for (Student s : myList) {
			System.out.println(s.age + " : " + s.name);
		}

		// Comparing on the basis of Age
		studentAge a = new studentAge();
		Collections.sort(myList, a);
		System.out.println("Soring on the basis of Age : ");
		for (Student st : myList) {
			System.out.println(st.name + " : " + st.age);
		}
	}

}

class Student {
	Integer age;
	String name;

	Student(Integer a, String s) {
		this.age = a;
		this.name = s;
	}
}

class studentAge implements Comparator<Student> {
	@Override
	public int compare(Student one, Student two) {
		if ((one.age).compareTo(two.age) > 0) {
			return 1;
		}
		if ((one.age).compareTo(two.age) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}

class studentName implements Comparator<Student> {
	@Override
	public int compare(Student one, Student two) {
		if ((one.name).compareTo(two.name) > 0) {
			return 1;
		}
		if ((one.name).compareTo(two.name) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}