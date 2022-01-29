package communityuni.com;

public class TestUpperLower {

	public static void main(String[] args) {
		//Upper toàn bộ chữ
		String s1="obama";
		s1=s1.toUpperCase();
		System.out.println(s1);
		//Upper chữ đầu
		String s2="obama";
		s2=s2.replaceFirst
				((s2.charAt(0)+""),(s2.charAt(0)+"").toUpperCase());
		System.out.println(s2);
		
		//Lower toàn bộ
		String s3="OBAMA";
		s3=s3.toLowerCase();
		System.out.println(s3);
		//Lower chữ đầu
		String s4="Obama";
		s4=s4.replaceFirst((s4.charAt(0)+""), (s4.charAt(0)+"").toLowerCase());
		System.out.println(s4);
	}

}
