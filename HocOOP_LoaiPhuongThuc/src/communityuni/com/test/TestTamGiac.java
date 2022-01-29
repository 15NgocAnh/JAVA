package communityuni.com.test;

import communityuni.com.model.TamGiac;

public class TestTamGiac {

	public static void main(String[] args) {
		TamGiac tg=new TamGiac(3, 4, 5);
		System.out.println("Cạnh A = "+tg.getCanhA());
		System.out.println("Cạnh B = "+tg.getCanhB());
		System.out.println("Cạnh C = "+tg.getCanhC());
		System.out.println("Chu vi tam giác = "+tg.tinhChuVi());
		System.out.println("Diện tích tam giác = "+tg.tinhDienTich());
	}

}
