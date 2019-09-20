package collectionsjava_prac;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Copy_Source_dest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sourceList= new LinkedList<String>();
		sourceList.add("A");
		sourceList.add("B");
		sourceList.add("C");
		sourceList.add("D");
		List<String> destList= new LinkedList<String>();
		destList.add("V");
		destList.add("W");
		destList.add("X");
		destList.add("Y");
		destList.add("Z");
		System.out.println("Before destlist copying" + destList);
		Collections.copy(destList, sourceList);
		System.out.println("After Copying the Destination" + destList);
		destList.forEach(I-> System.out.println(I));

	}

}
