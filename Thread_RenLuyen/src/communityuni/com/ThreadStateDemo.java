package communityuni.com;

public class ThreadStateDemo extends Thread{

	public static void main(String[] args) {
		ThreadStateDemo th2=new ThreadStateDemo();
		System.out.println("Thread th is born");
		System.out.println("Thread th is ready");
		th2.start();
	}
	public void run() 
	{
		System.out.println("Thread th is running");
	}
}
