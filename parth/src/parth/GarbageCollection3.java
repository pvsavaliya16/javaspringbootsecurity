package parth;

class GarbageCollection3 {
	
	String name;
	GarbageCollection3(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		GarbageCollection3 t1 = new GarbageCollection3("Null Object 1");
		GarbageCollection3 t2 = new GarbageCollection3("Null Object 2");
		t1 = t2;
		System.gc();
	}
        
        @Override
	protected void finalize() throws Throwable {
		System.out.println(this.name + " successfully destroyed !!");
	}
}