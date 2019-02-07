class Abc {
	int x;
	public void display() {
		System.out.println("Hello");
	}
}

class ClassExample {
	public static void main(String[] args) {
		Abc abc = new Abc();
		System.out.println(Abc.class);
	}
}