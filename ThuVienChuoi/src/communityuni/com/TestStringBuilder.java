package communityuni.com;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("Hello ");
		sb.append("World!");
		//Thêm vào
		sb.insert(6, "every body in the ");
		//Xóa từ vị trí thứ mấy đến thứ mấy
		sb.delete(16, 29);
		System.out.println(sb);
		//Đảo ngược
		sb.reverse();
		String s=sb.toString();
		System.out.println(s);
	}

}
