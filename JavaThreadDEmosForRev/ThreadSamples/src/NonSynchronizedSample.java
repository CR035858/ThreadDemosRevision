class Thread1
{
	//SYNCHRONIZED METHOD
	public /*synchronized*/ void call()
	{
		System.out.println("Goods Produced...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Goods Consumed...");
	}
	
}
class MyThread5 extends Thread
{
	Thread1 t1;
	public MyThread5(Thread1 t1)
	{
		this.t1 = t1;
	}
	public void run()
	{
		//SYNCHRONIZED BLOCK
		synchronized(t1)
		{
			t1.call();
		}
	}
}
public class NonSynchronizedSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		MyThread5 mt1 = new MyThread5(t1);
		MyThread5 mt2 = new MyThread5(t1);
		MyThread5 mt3 = new MyThread5(t1);
		mt1.start();
		mt2.start();
		mt3.start();
		
	}

}
