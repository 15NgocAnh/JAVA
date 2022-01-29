package communityuni.com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import communityuni.com.model.DanhBa;

public class SerializeFileFactory {
	public static boolean SaveFile(ArrayList<DanhBa> dsDB, String path)
	{
		try 
		{
			FileOutputStream fos=new FileOutputStream(path);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(dsDB);
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
	public static ArrayList<DanhBa> ReadFile(String path)
	{
		ArrayList<DanhBa> dsDB=new ArrayList<DanhBa>();
		try 
		{
			FileInputStream fis=new FileInputStream(path);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object data=ois.readObject();
			dsDB=(ArrayList<DanhBa>) data;
			ois.close();
			fis.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return dsDB;
	}
}
