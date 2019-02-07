class SayHello {
	SayHello() { System.out.println("Hello"); }
	SayHello(String name) {
		this();
		System.out.println(name);
	}
}

class UseOfThis3 {
	public static void main(String[] args) {
		SayHello sh = new SayHello("Parth");
	}
}