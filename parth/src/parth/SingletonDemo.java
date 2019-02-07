class Demo {
	private static Demo demo = null;
	public int x;
	private Demo() {}
	static Demo createObject() {
		if (demo == null) {
			demo = new Demo();
		}
		return demo;
	}
}

class SingletonDemo {
	public static void main(String[] args) {
		Demo s1 = Demo.createObject();
		Demo s2 = Demo.createObject();
		s2.x = 20;
		s1.x = 50;
		System.out.println(s1.x);
		System.out.println(s2.x);	
	}	
}