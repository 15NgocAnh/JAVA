package communityuni.com;

import java.util.Scanner;

public class TestMath {

	public static void main(String[] args) {
		//pi
		System.out.println("PI = "+Math.PI);
		//giá trị tuyệt đối
		double abs = Math.abs(-5);
		System.out.println("|-5| = "+abs);
		//lũy thừa
		double pow = Math.pow(3, 4);
		System.out.println("3^4 = "+pow);
		//mũ
		double sqrt = Math.sqrt(25);
		System.out.println("Căn bậc của 25 = "+sqrt);
		//max
		double max = Math.max(9, 12);
		System.out.println("Max = "+max);
		//min
		double min = Math.min(9, 12);
		System.out.println("Min = "+min);
		//tính sin,cos,tan,cot dựa vào giá trị của góc 
		// radian = Math.PI*goc/180
		System.out.print("Mời bạn nhập vào giá trị của góc: ");
		double goc=new Scanner(System.in).nextDouble();
		double radian = Math.PI*goc/180;
		double sin = Math.sin(radian);
		double cos = Math.cos(radian);
		double tan = Math.tan(radian);
		double cot = 1/tan;
		System.out.println("sin("+goc+") = "+sin);
		System.out.println("cos("+goc+") = "+cos);
		System.out.println("tan("+goc+") = "+tan);
		System.out.println("cot("+goc+") = "+cot);
	}

}
