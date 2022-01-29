package communityuni.com;

public class Hinh4 {
	public static void VeHinh4(int n) {
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if ((i+j==n-1) || (j==n/2) || (i==0 && j>=n/2) || (i==n-1 && j<=n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		VeHinh4(11);
	}

}
