// package parth;

class AutoboxAndUnbox {
	public static void main(String[] args) {
		Character c1 = new Character('x');
		Integer i1 = new Integer(6);
		Float f1 = new Float(5.5);
		Double d1 = new Double(9.9);

		// Unboxing

		char c2 = c1;
		int i2 = i1;
		float f2 = f1;
		double d2 = d1;

		System.out.println(c2);
		System.out.println(i2);
		System.out.println(f2);
		System.out.println(d2);

		// Autoboxing

		Integer[] intArray = new Integer[10];
		for (int i=0; i<10; i++) {
			intArray[i] = i;
		}

		for (Integer x : intArray) {
			System.out.println(x);
		}
	}
}