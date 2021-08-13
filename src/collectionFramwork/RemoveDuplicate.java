package collectionFramwork;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(50);
		list.add(100);
		list.add(150);
		list.add(200);
		list.add(50);
		list.add(100);
		list.add(150);
		list.add(300);
		list.add(250);
		list.add(100);
		
		System.out.println(list);
		System.out.println(list.size());
		
		LinkedHashSet<Integer> newList = new LinkedHashSet<Integer>(list);
		System.out.println(newList);
		
		ArrayList<Integer> removalList = new ArrayList<>(newList);
		System.out.println(removalList);

	}

}
