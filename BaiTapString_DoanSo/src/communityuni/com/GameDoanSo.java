package communityuni.com;

import java.util.Random;
import java.util.Scanner;

public class GameDoanSo {
	public static void Game()
	{
		Random rd=new Random();
		int soMay=rd.nextInt(6);
		System.out.println("Chương trình đã random một con số từ 0..5 mời bạn đoán!");
		int soNguoi;
		int diem=5;
		while(true)
		{
			System.out.println("Mời bạn đoán: ");
			soNguoi=new Scanner(System.in).nextInt();
			if (soNguoi==soMay)
			{
				System.out.println("Bạn đã đoán đúng. Bạn được cộng 1 điểm.");
				diem++;
				System.out.println("Hiện tại bạn có "+diem+" điểm.");
			}
			else
			{
				System.out.println("Bạn đã đoán sai. Bạn bị trừ 1 điểm.");
				diem--;
				System.out.println("Hiện tại bạn có "+diem+" điểm.");
			}
			if (diem==10)
			{
				System.err.println("Congratulations! You win!");
				break;
			}
			if (diem==0)
			{
				System.err.println("Game Over!");
				break;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Chào mừng bạn đến với Game Đoán Số!");
		System.out.println("Hiện tại bạn có 5 điểm.");
		Game();
	}

}
