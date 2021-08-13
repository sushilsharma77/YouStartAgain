package collectionFramwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparision {

	public static void main(String[] args) {
		//equal or not
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","C","B","D","E"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","f"));
		
		Collections.sort(l1);
		System.out.println(l1);
		
		Collections.sort(l2);
		System.out.println(l2);
		System.out.println(l1.equals(l2));
		
		//common elements
		l1.retainAll(l2);
		System.out.println(l1);
		
		//additional elements
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","C","B","D","E"));
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","f"));
		l3.removeAll(l4);
		System.out.println(l3);
		
		//missing element
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","C","B","D","E"));
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A","B","C","D","f"));
		l6.removeAll(l5);
		System.out.println(l6);
	}

}
