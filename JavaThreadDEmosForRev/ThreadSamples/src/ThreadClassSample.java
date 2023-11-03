class MyThread3 extends Thread
{
	public MyThread3()
	{
		System.out.println("ChildThread "+this);
		start();
	}
	public void run()
	{
		System.out.println("Entering Child Thread....");
		System.out.println("Child Thread functionality executed....");
		System.out.println("Exiting Child Thread.....");
	}
}
public class ThreadClassSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("In The Main Thread.....");
			
			MyThread3 mt3 = new MyThread3();
			try {
				mt3.join(); //mt3.t1.join()
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Back in the Main Thread....");
			System.out.println("Exiting Main Thread.....");
	}

}
