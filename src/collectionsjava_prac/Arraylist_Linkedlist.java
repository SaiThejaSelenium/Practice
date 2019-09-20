package collectionsjava_prac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Arraylist_Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
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
		//liststrings.clear();
		//Adding the list of value from one arry to another array using add all
		liststring.addAll(liststrings);		
		System.out.println(liststring);
		//Removing the 3 position value from the array
		liststring.remove(3);
		System.out.println(liststring);
		//Adding the value at position based on the index value
		liststring.add(3, "Four");
		System.out.println(liststring);
		//Retrieving the elements based on the index
		String element = liststring.get(4);
		System.out.println(element);
		//for updating the string value in the Array using linked list
		liststring.set(2, "HI");
		System.out.println(liststring);
		liststring.set(2, "Three");
		System.out.println(liststring);
		//For Retrieving the first value of array
		Number first=((LinkedList<Integer>) listnumbers).getFirst();
		System.out.println(first);
		String first_str=((LinkedList<String>)liststrings).getFirst();
		System.out.println(first_str);
		String Last_str=((LinkedList<String>)liststrings).getLast();
		System.out.println(Last_str);
		System.out.println(liststring);
		liststring.remove(2);
		System.out.println(liststring);
		liststring.set(2, "Three");
		System.out.println(liststring);
		liststring.add(3,"Four");
		System.out.println(liststring);
		liststring.remove("Three");
		System.out.println(liststring);
		liststring.add(2,"Three");
		System.out.println(liststring);
		//THis is used to find the iteration finding
		Iterator<String> iterat= liststrings.iterator();
		while(iterat.hasNext()) {
			System.out.println(iterat.next());
		}

	}

}
