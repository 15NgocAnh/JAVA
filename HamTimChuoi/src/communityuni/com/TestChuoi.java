package communityuni.com;

import java.util.StringTokenizer;

public class TestChuoi {

	public static void main(String[] args) {
		String s="hello mother fucker";
		int a=s.indexOf("h");
		System.out.println("Ký tự 'h' nằm ở vị trí thứ "+a);
		int b=s.lastIndexOf("h");
		System.out.println("Ký tự 'h' nằm ở vị trí thứ "+b);
		if (s.contains("df"))
		{
			System.out.println("Chuỗi có chứa ký tự 'df'");
		}
		else
		{
			System.out.println("Chuỗi không chứa ký tự 'df'");
		}
		StringTokenizer st=new StringTokenizer(s);
		int dem=0;
		while(st.hasMoreTokens())
		{
			String c=st.nextToken();
			if (c.contains("o"))
			{
				dem++;
			}
		}
		System.out.println("Có "+dem+" ký tự 'o' ở trong chuỗi");
	}

}
