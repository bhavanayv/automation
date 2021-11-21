package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoMaps {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("https://demo.actitime.com");
		al.add("admin");
		al.add("admin@actitime.com"); // if email is added in future
		al.add("manager");
		System.out.println(al.get(2)); // it will print email instead of password- manager
		HashMap<String, String> hs=new HashMap<String, String>();
		hs.put("url", "https://demo.actitime.com");
		hs.put("username","admin");
		hs.put("email", "admin@actitime.com"); 
		hs.put("password","manager");
		System.out.println(hs.get("password")); //  whether mail is added or not in future, it will print same output
	}
}
