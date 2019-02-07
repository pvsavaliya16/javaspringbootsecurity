public class GarbageCollection4 {
	
	GarbageCollection4 a;

	public static void main(String[] args) {
		GarbageCollection4 t1 = new GarbageCollection4();
		GarbageCollection4 t2 = new GarbageCollection4();
		t1.a = t2;
		t2.a = t1;
		t1 = null;
		t2 = null;
		System.gc();
	}

	protected void finalize() throws Throwable {
		System.out.println("Object successfully destroyed !!");
	}
}