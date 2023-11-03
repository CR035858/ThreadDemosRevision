class MyNewThread implements Runnable
{

	Thread t1;
	String thName;
	public MyNewThread(String thName)
	{
		this.thName = thName;
		t1 = new Thread(this,thName);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread :"+thName+": Loop :"+(i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class MultipleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("In The Main Thread....");
		System.out.println("Invoking Child Threads...");
		
		MyNewThread mt1 = new MyNewThread("ChildThread1");
		MyNewThread mt2 = new MyNewThread("ChildThread2");
		MyNewThread mt3 = new MyNewThread("ChildThread3");
		
		mt1.t1.start();
		mt2.t1.start();
		mt3.t1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread Loop "+(i+1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting Main Thread....");

	}

}
