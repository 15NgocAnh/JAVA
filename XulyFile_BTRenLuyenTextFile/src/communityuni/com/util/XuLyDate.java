package communityuni.com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class XuLyDate {
	static SimpleDateFormat spf=new SimpleDateFormat("dd/MM/yyyy");
	public static Date fromString(String d)
	{
		try 
		{
			Date date=spf.parse(d);
			return date;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	public static String fromDate(Date d)
	{
		return spf.format(d);
	}
}
