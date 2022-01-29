package communityuni.com;

public class MyThread1 implements Runnable{

	public static void main(String[] args) {
		MyThread1 run1=new MyThread1();
		Thread th1=new Thread(run1);
		th1.start();
		System.out.println("This is the main Thread");
	}

	public void run() 
	{
		while(true)
		{
			try {
				for (int i=0;i<10;i++)
				{
					System.out.println("This is the child Thread");
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
