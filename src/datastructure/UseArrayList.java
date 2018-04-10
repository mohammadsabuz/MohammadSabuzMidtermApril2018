package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases. */
		ArrayList<String> student = new ArrayList<String>();
		student.add("Mo");
		student.add("Mo Money");
		student.add("Mo Problem");
		student.add("Mo Fun");
		System.out.println("All values of array = " + student);
		for (int a = 1; a < 3; a++) {
			System.out.println("specified from index to index = " + student.get(a));
		}
		//connect to db
		ConnectDB connect = new ConnectDB();
		connect.insertDataFromArrayListToMySql(student, "employee", "name");

		Iterator<String> it = student.iterator();
		System.out.println(it.next());
		System.out.println(it.hasNext());
		while (it.hasNext())
			System.out.println("from while loop = " + it.next());
		for (Object x : student) {
			System.out.println(x);
		}
	}
}