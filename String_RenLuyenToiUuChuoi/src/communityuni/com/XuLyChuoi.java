package communityuni.com;

public class XuLyChuoi {
	public static String toiUu(String s)
	{
		String sToiUu = s;
		sToiUu = sToiUu.trim();
		String []arrWord = sToiUu.split(" ");
		sToiUu ="";
		for (String x : arrWord)
		{
			String newWord = x.toLowerCase();
			if (newWord.length()>0)
			{
				newWord=newWord.replaceFirst(newWord.charAt(0)+"", (newWord.charAt(0)+"").toUpperCase());
				sToiUu += newWord +" ";
			}
		}
		return sToiUu.trim();
	}
	public static void main(String[] args) {
		String s="    NGUyễn     THị     ngọC        áNH     ";
		System.out.println(s);
		String sToiUu=toiUu(s);
		System.out.println(sToiUu);
	}

}
