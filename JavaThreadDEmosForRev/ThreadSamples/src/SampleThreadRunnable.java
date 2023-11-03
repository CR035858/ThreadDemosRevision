class MyThread implements Runnable
{
	Thread t1;
	public MyThread()
	{
		t1 = new Thread(this,"ChildThread");
		System.out.println("Current Thread "+t1);
		t1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("We are entering  Child Thread...");
		System.out.println("Child Thread functionality is on....");
		System.out.println("Exiting Child Thread....");
	}
}
public class SampleThreadRunnable {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("We are in Main Thread....");
			System.out.println("ABout to invoke Child Thread...");
			MyThread mt1 = new MyThread();
			System.out.println("Back in the Main Thread...");
			System.out.println("Exiting Main Thread....");

	}

}
