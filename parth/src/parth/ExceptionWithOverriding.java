package parth;

class Base {
	void display1() {
		System.out.println("Display1: Base class");
	}

	void display2() {
		System.out.println("Display2: Base class");
	}

	void display3() throws RuntimeException {
		System.out.println("Display3: Base class");
	}

	void display4() throws RuntimeException {
		System.out.println("Display4: Base class");
	}
}

class Child extends Base {
	void display1() throws ArithmeticException {
		System.out.println("Display1: Child class");
	}

	void display2() throws ClassNotFoundException { // will give error because ClassNotFoundException- 
		System.out.println("Display2: Child class"); // is checked exception so it will not be able to override base class method
	}

	void display3() throws ClassNotFoundException {  //will give error becauese ClassNotFoundException-
		System.out.println("Display3: Child class");  // is not child exception of RuntimeException which-
	}                                                 // is thrown by Base class method

	void display4() throws ArithmeticException {
		System.out.println("Display4: Child class");
	}
}

class ExceptionWithOverriding {
	public static void main(String[] args) {
		Base b = new Child();
		b.display1();
		b.display2();
		b.display3();
		b.display4();		
	}	
}