package communityuni.com;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList ds1=new ArrayList();
		ArrayList<Integer> ds2=new ArrayList<Integer>();
		ArrayList<String> ds=new ArrayList<String>();
		ds.add("I");
		ds.add("love");
		ds.add("you");
		for (int i=0;i<ds.size();i++)
			System.out.println(ds.get(i));
		System.out.println("---------");
		ds.add(1, "don't");
		for (int i=0;i<ds.size();i++)
			System.out.println(ds.get(i));
		System.out.println("---------");
		//xóa ở vị trí
		ds.remove(1);
		for (int i=0;i<ds.size();i++)
			System.out.println(ds.get(i));
		System.out.println("---------");
		//xóa hết
		ds.clear();
		System.out.println("Chuỗi có "+ds.size()+" phần tử.");
	}

}
