package communityuni.com;

public class TestChuoi {

	public static void main(String[] args) {
		String s1=new String();
		String s2=new String("Baby");
		String s3="Honey";
		System.out.println("Chiều dài của chuỗi s1 = "+s1.length());
		System.out.println("Chiều dài của chuỗi s2 = "+s2.length());
		System.out.println("Chiều dài của chuỗi s3 = "+s3.length());
		if (s2.equals(s3))
		{
			System.out.println("Giá trị chuỗi s2 bằng s3");
		}
		else
		{
			System.out.println("Giá trị chuỗi s2 khác s3");
		}
	}

}
