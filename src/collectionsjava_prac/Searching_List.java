package collectionsjava_prac;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Searching_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> liststring= new ArrayList<>();
		liststring.add("One");
		liststring.add("Two");
		liststring.add("Three");
		liststring.add("Four");
		System.out.println(liststring);
		
		//LikedList
		List<String> liststrings=new LinkedList<String>();
		liststrings.add("Five");
		liststrings.add("Six");
		liststrings.add("Seven");
		liststrings.add("Eight");
		liststrings.add("Nine");
		liststrings.add("Ten");
		liststrings.add("One");
		liststrings.add("Five");
		List<Integer> listnumbers= new LinkedList<Integer>();
		listnumbers.add(1);
		listnumbers.add(2);
		listnumbers.add(3);
		listnumbers.add(4);
		listnumbers.add(5);
		listnumbers.add(6);
		listnumbers.add(7);
		listnumbers.add(8);
		listnumbers.add(9);
		liststring.addAll(liststrings);
		System.out.println(liststring);
		//For each for iterating in linked list
		liststring.forEach(s-> System.out.println(s));
		if (liststring.contains("Five")) {
			System.out.println("Fount the Element");
		} else
		{
			System.out.println("Element was not found");
		}
		int firstindex=listnumbers.indexOf(4);
		int lastindex=liststring.indexOf("Five");
		System.out.println(liststring);
		System.out.println(firstindex);
		System.out.println(lastindex);

	}

}
