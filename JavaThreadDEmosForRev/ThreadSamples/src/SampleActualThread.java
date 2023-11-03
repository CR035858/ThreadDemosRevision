
public class SampleActualThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = Thread.currentThread();
		System.out.println("Current Thread "+t);
		t.setName("NewThread");
		System.out.println("Thread After Name Change "+t);
	}

}
