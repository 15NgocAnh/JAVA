package communityuni.com;

import java.util.Random;
import java.util.Scanner;

public class GameDoanSo {
	public static void Game()
	{
		Random rd=new Random();
		int soMay=rd.nextInt(101);
		System.out.println("Chương trình đã random ra một số từ 0...100. Mời bạn đoán!");
		int soNguoi;
		int soLanDoan = 0;
		do
		{
			System.out.print(" - Bạn đoán số: ");
			soNguoi=new Scanner(System.in).nextInt();
			soLanDoan++;
			System.out.println("Lần đoán thứ "+soLanDoan);
			if (soNguoi==soMay)
			{
				System.out.println("Bạn đã chiến thắng! Số máy = "+soMay);
				break;
			}
			else if (soNguoi>soMay)
			{
				System.out.println("Bạn đoán sai rồi. Số máy < Số người.");
			}
			else 
			{
				System.out.println("Bạn đoán sai rồi. Số máy > Số người.");
			}
			if (soLanDoan==7)
			{
				System.out.println("Bạn đã thua cuộc! Chúc bạn may mắn lần sau!");
				break;
			}
		}
		while (soLanDoan<=7);
	}
	public static void main(String[] args) {
		while (true)
		{
			Game();
			System.out.print("Bạn có muốn chơi tiếp không? (c/k): ");
			String ch=new Scanner(System.in).nextLine();
			if (ch.equalsIgnoreCase("k"))
				break;
		}
		System.out.println("Cảm ơn bạn đã chơi! Tạm biệt!");
	}

}
