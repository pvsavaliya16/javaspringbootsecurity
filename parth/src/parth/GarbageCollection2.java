class GarbageCollection2 {
	
	String name;
	GarbageCollection2(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		GarbageCollection2 t1 = new GarbageCollection2("Null Object");
		t1 = null;
		System.gc();
	}

	protected void finalize() throws Throwable {
		System.out.println(this.name + " successfully destroyed !!");
	}
}