package communityuni.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestDinhDangSo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Mời bạn nhập vào điểm toán: ");
		double a=sc.nextDouble();
		System.out.print("Mời bạn nhập vào điểm lý: ");
		double b=sc.nextDouble();
		System.out.print("Mời bạn nhập vào điểm lý: ");
		double c=sc.nextDouble();
		double dtb = (a+b+c)/3;
		System.out.println("Điểm trung bình môn là: "+dtb);
		DecimalFormat dcf=new DecimalFormat("#.##");
		System.out.println("ĐTB = "+dcf.format(dtb));
	}

}
