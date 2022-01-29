package communityuni.com;

import java.util.StringTokenizer;

public class TestStringTokenizer {

	public static void main(String[] args) {
		String s="Hello every body in the world";
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens())
		{
			String a=st.nextToken();
			System.out.println(a);
		}
		System.out.println("------------");
		String s1="Every;country;in;the;world;are;so;fantastic";
		StringTokenizer st1=new StringTokenizer(s1,";");
		while(st1.hasMoreTokens())
		{
			String a=st1.nextToken();
			System.out.println(a);
		}
	}

}
