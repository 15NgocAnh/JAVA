package communityuni.com;

public class TestCompareEqual {

	public static void main(String[] args) {
		String s1="Ánh";
		String s2="ánh";
		
		int a=s1.compareTo(s2);
		if (a==0)
			System.out.println("s1=s2");
		else if (a>0)
			System.out.println("s1>s2");
		else
			System.out.println("s1<s2");
		//So sánh không kể chữ hoa chữ thường
		int b=s1.compareToIgnoreCase(s2);
		if (b==0)
			System.out.println("s1=s2");
		else if (b>0)
			System.out.println("s1>s2");
		else
			System.out.println("s1<s2");
		
		//So sánh với equals
		if (s1.equals(s2))
			System.out.println("s1=s2");
		else
			System.out.println("s1!=s2");
		//So sánh không kể chữ hoa chữ thường
		if (s1.equalsIgnoreCase(s2))
			System.out.println("s1=s2");
		else
			System.out.println("s1!=s2");
	}

}
