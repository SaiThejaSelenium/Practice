package collectionsjava_prac;

import java.util.Arrays;
import java.util.List;

public class Retrive_some_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> liststring= Arrays.asList("Hi","Welcome","To","Java","World","Sai","Theja");
		System.out.println("Original list before filter" + liststring);
		List<String> str= liststring.subList(2, 6);
		System.out.println("After Filter" + str);
		str.forEach(s-> System.out.println(s));
		
		

	}

}
