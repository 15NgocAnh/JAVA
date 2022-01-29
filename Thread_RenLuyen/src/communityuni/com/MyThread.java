package communityuni.com;

public class MyThread extends Thread{

	public static void main(String[] args) {
		MyThread th=new MyThread();
		th.start();
		System.out.println("This is the main Thread");
	}
	public void run() {
		super.run();
		while(true)
		{
		try 
		{
			for (int i=0;i<10;i++)
			{
				System.out.println("This is the child Thread");
				sleep(1000);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	}
}
