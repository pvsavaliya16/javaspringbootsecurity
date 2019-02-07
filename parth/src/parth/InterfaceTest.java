interface I1 {
	int a = 20;
	default void display() {
		System.out.println("a = " + a);
	}
}

interface I2 extends I1{
	//int a = 20;
	void display();
}

class Test implements I1, I2 { 
	public void display() {
		System.out.println("a = " + a);
	}
}
	


class InterfaceTest {
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
	}
}