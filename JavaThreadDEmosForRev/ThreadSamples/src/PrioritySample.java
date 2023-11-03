class PriorityThread implements Runnable
{

	int priority;
	Thread t1;
	public PriorityThread(int priority)
	{
		this.priority = priority;
		t1 = new Thread(this,"ChildThread");
		t1.setPriority(priority);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println(t1+"Loop "+(i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class PrioritySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("In The Main Thread....");
			PriorityThread pt1 = new PriorityThread(Thread.NORM_PRIORITY+3);
			PriorityThread pt2 = new PriorityThread(Thread.NORM_PRIORITY+1);
			PriorityThread pt3 = new PriorityThread(Thread.NORM_PRIORITY-1);
			pt1.t1.start();
			pt2.t1.start();
			pt3.t1.start();
			
			try {
				pt1.t1.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				pt2.t1.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				pt3.t1.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
			System.out.println("Exiting  Main Thread....");
	}

}
