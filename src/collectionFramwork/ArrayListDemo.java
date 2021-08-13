package collectionFramwork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(250);
		number.add(450);
		number.add(275);
		number.add(50);
		number.add(250);
		number.add(0);

		int i0 = number.get(0);
		System.out.println(i0);
		
		int size = number.size();
		System.out.println(size);
		
		int r = number.remove(5);
		System.out.println(r);
		
		System.out.println(number.size());
		
		ArrayList<String>name = new ArrayList<>();
		name.add("Tom");
		name.add("Brian");
		name.add("Tony");
		name.add("Lisa");
		name.add("Hardy");
		
		int all = name.size();
		
		for(int i=0; i<all; i++) {
			System.out.println(name.get(i));
		}
		
		for(String allName:name) {
		System.out.println(allName);
		}
		System.out.println("___________");
		Iterator <String> it = name.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
			
		}

		
	}

}
