package communityuni.com;

public class TestTrim {

	public static void main(String[] args) {
		String s="        Xin chào cả nhà mình nhá!        ";
		//Chỉ xóa được khoảng trắng đầu và cuối
		s=s.trim();
		System.out.println(s);
		
		//Xóa khoảng trắng đầu
		String s1="    Hello!   ";
		int vtTrai=0;
		int i=0;
		for (i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if (c==' ')
				vtTrai=i;
			else
				break;
		}
		s1=s1.substring(i);
		System.out.println(s1);
		
		//Xóa khoảng trắng cuối
		String s2="    Hello!   ";
		int vtPhai=0;
		for (i=s2.length()-1;i>=0;i--)
		{
			char c=s2.charAt(i);
			if (c==' ')
				vtPhai=i;
			else
				break;
		}
		s2=s2.substring(0, i);
		System.out.println(s2);
	}

}
