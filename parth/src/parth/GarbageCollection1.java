class GarbageCollection1 {
	String nameOfObject;
	GarbageCollection1(String nameOfObject) {
		this.nameOfObject = nameOfObject;
	}

	static void show() {
		GarbageCollection1 g1 = new GarbageCollection1("Object 1");
		System.out.println("Name = " + g1.nameOfObject);
	}

	@Override

	protected void finalize() throws Throwable {
		System.out.println(this.nameOfObject + " successfullly destroyed !!!");
	}

	public static void main(String[] args) {
		show();
		System.gc();
	}
}