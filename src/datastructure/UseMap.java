package datastructure;

import databases.ConnectDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class UseMap {

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		List<String> employees_of_mgt = new ArrayList();
		employees_of_mgt.add("employee-1");
		employees_of_mgt.add("employee-2");
		employees_of_mgt.add("employee-3");

		List<String> employees_of_act = new ArrayList();
		employees_of_act.add("employees-4");
		employees_of_act.add("employees-5");
		employees_of_act.add("employees-6");

		List<String> employees_of_sls = new ArrayList();
		employees_of_sls.add("employee-7");
		employees_of_sls.add("employee-8");
		employees_of_sls.add("employee-9");


		Map<String, List<String>> map = new HashMap<String,List<String>>();
		map.put("Management", employees_of_mgt);
		map.put("Accountant", employees_of_act);
		map.put("Sales", employees_of_sls);

		//for each loop
		for(Map.Entry key: map.entrySet()){
			System.out.println(key.getKey()+" "+key.getValue());
		}

		System.out.println("****************************************");
		//Iterator with for loop

		Iterator it =map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		ConnectDB connect = new ConnectDB();
		//connect.insertDataFromMapToMySql((Map<String, List<String>>) map,"department","employees");
		connect.insertNewDataFromMapToMySql((List<String>) employees_of_mgt,"table1","employee");
		connect.insertNewDataFromMapToMySql((List<String>) employees_of_act,"table1","employee");
		connect.insertNewDataFromMapToMySql((List<String>) employees_of_sls,"table1","employee");
	}

}
