package communityuni.com;

public class Hinh2 {
	public static void VeHinh2(int n)
	{
		for (int i=0;i<n;i++)
		{
			for (int j=n-i;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		VeHinh2(11);
	}

}
