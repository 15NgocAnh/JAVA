package communityuni.com.model;

public class MyThread extends Thread{

	public void run() {
		super.run();
		try 
		{
			for (int i=0;i<10;i++)
			{
				MyThread.sleep(500);
				System.out.println(MyThread.currentThread().getName()+":i = "+i);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
