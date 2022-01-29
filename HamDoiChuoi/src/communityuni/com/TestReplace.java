package communityuni.com;

public class TestReplace {

	public static void main(String[] args) {
		String s="Hi my name is T, i'm good boy!";
		s=s.replace("Hi", "Hello");
		System.out.println(s);
		String k="tạm biệt, mình là Ngọc Ánh, tạm biệt!";
		k=k.replaceFirst("tạm biệt", "Chào bạn");
		System.out.println(k);
	}

}
