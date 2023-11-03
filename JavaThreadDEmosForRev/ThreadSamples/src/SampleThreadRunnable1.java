class MyThread1 implements Runnable
{
	Thread t1;
	public MyThread1()
	{
		t1 = new Thread(this,"Child Thread");
		t1.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Entered The Child Thread...");
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread Loop "+(i+1));
			
			try{
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting Child Thread...");
		
	}
	
}
public class SampleThreadRunnable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("In The Main Thread....");
		MyThread1 mt1 = new MyThread1();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread Loop :"+(i+1));
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting Main Thread....");
	}

}
