package communityuni.com;

public class Hinh1 {
	public static void VeHinh1(int n) {
		for (int i=0;i<n;i++)
		{
			for (int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		VeHinh1(10);
	}

}
