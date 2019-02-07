class MethodOverloading {
	int add(int a,int b) {
		System.out.println("Method 1 called");
		return a + b;
	}
	int add(int a, int b, int c) {
		System.out.println("Method 2 called");
		return a + b + c;
	}
	public static void main(String[] args) {
		MethodOverloading ml = new MethodOverloading();
		System.out.println(ml.add(5,6));
		System.out.println(ml.add(6,7,8));
	}
}