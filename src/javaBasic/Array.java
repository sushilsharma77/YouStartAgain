package javaBasic;

public class Array {

	public static void main(String[] args) {

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);

		String s[] = new String[3];
		s[0] = "Good morning";
		s[1] = "Good Afternoon";
		s[2] = "Good night";

		System.out.println(s.length);// size of array
		// all values of the array
		for (int in = 0; in < s.length; in++) {
			System.out.println(s[in]);
		}

		// to store different data type in a array
		// use object array
		Object o[] = new Object[4];
		o[0] = 2;
		o[1] = 10.52;
		o[2] = "Hello";
		o[3] = true;

		// System.out.println(o[4]); gives arrayOutOfBoundExcption.

		for (int x = 0; x < o.length; x++) {
			System.out.println(o[x]);
		}

	}

}
