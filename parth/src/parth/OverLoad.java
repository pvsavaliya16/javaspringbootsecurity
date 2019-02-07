class TestOverLoad {
	int add(int a, int b) {
		return a+b;
	}
	double add(int a, int b) {
		double y = a+b;
		return y;
	}
}
class OverLoad {
	public static void main(String[] args) {
		TestOverLoad tol = new TestOverLoad();
		System.out.println("Total = " +tol.add(10, 20));
	}
}