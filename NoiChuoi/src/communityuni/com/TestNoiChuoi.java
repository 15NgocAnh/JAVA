package communityuni.com;

public class TestNoiChuoi {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Mother";
		String s3=s1+" "+s2;
		System.out.println(s3);
		String s4=s3+" Fucker!";
		System.out.println(s4);
		
		//sử dụng StringBuilds
		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		sb.append(" ");
		sb.append(s2);
		sb.append(" Fucker!");
		System.out.println(sb.toString());
	}

}
