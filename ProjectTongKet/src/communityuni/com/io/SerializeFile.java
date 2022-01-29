package communityuni.com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import communityuni.com.model.Contact;

public class SerializeFile {
	public static boolean SaveFile(HashMap<Integer, Contact> csdl, String path)
	{
		try 
		{
			FileOutputStream fos=new FileOutputStream(path);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(csdl);
			oos.close();
			fos.close();
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}
	public static HashMap<Integer, Contact> ReadFile(String path)
	{
		HashMap<Integer, Contact> csdl=new HashMap<Integer, Contact>();
		try {
			FileInputStream fis=new FileInputStream(path);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object data = ois.readObject();
			csdl=(HashMap<Integer, Contact>) data;
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return csdl;
	}
}
