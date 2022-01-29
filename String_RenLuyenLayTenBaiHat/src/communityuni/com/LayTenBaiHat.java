package communityuni.com;

public class LayTenBaiHat {
	public static String tenBaiHatCoMp3(String baiHat)
	{
		int vtCuoi = baiHat.lastIndexOf("/");
		String ten=baiHat.substring(vtCuoi+1);
		return ten;
	}
	public static String tenBaiHatKoMp3(String baiHat)
	{
		int vtdau=baiHat.lastIndexOf("/");
		int vtcuoi=baiHat.lastIndexOf(".");
		String ten=baiHat.substring(vtdau+1, vtcuoi);
		return ten;
	}
	public static void main(String[] args) {
		String baiHat="D:/music/bolero/longme.mp3";
		String a=tenBaiHatCoMp3(baiHat);
		System.out.println(a);
		String b=tenBaiHatKoMp3(baiHat);
		System.out.println(b);
	}

}
