
public class MyThreadPriority implements Runnable {

	Thread t1;
	public MyThreadPriority(int priority)
	{
		t1 = new Thread(this,"childthread");
		t1.setPriority(priority);
		t1.start();
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(t1+" Loop "+i);
			try 
			{
				t1.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//public static const int NORM_PRIORITY = 5;
		MyThreadPriority mtp1 = new MyThreadPriority(Thread.NORM_PRIORITY+3);//8
		MyThreadPriority mtp2 = new MyThreadPriority(Thread.NORM_PRIORITY+1);//6
		MyThreadPriority mtp3 = new MyThreadPriority(Thread.NORM_PRIORITY-1);//4
		
		//mtp1.t1.start();
		//mtp2.t1.start();
		//mtp3.t1.start();
		
		try {
			mtp1.t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			mtp2.t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			mtp3.t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
