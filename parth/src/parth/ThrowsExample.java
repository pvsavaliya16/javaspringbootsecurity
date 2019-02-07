package parth;

class NewException extends Exception {
    public NewException(String str) {
        super(str);
    }
}

class TestClass {
	void throwNewException() throws NewException {
		throw new NewException("User throws ArithmeticException");
	}	
	void throwArithmeticException() throws ArithmeticException {
		throw new ArithmeticException();
	}
}

class ThrowsExample {
	public static void main(String[] args) {
	try{
		TestClass t1 = new TestClass();
		t1.throwNewException();
	} catch(Exception e) {
		System.out.println("Exception:" + e);
	}

	}
}