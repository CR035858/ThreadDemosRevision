class MyThread2 implements Runnable
{
	Thread mt1 = new Thread();
	public MyThread2()
	{
		mt1 = new Thread(this,"ChildThread");
		mt1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Entering Child Thread...");
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread Loop :"+(i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Exiting  Child Thread...");
	}
	
}
public class SampleThreadRunnable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("In the Main Thread....");
			System.out.println("About to Invoke Child Thread...");
			MyThread2 mt2 = new MyThread2();
			System.out.println("Is Child Thread ALive :"+mt2.mt1.isAlive());
			try 
			{
				mt2.mt1.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Is Child Thread ALive :"+mt2.mt1.isAlive());
			for(int i=0;i<5;i++)
			{
				System.out.println("Main Thread Loop :"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Is Child Thread ALive :"+mt2.mt1.isAlive());
			System.out.println("Exiting Main Thread....");
	}

}
