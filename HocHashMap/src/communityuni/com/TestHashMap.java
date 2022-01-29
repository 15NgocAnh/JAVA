package communityuni.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "What");
		map.put(2, "ever");
		map.put(3, "I");
		map.put(4, "have");
		map.put(5, "thank");
		map.put(6, "for");
		map.put(7, "God");
		//Xuất toàn bộ
		Collection<String> ds=map.values();
		for (String ten : ds)
			System.out.print(ten+" ");
		System.out.println();
		
		Set<Integer> dsMa=map.keySet();
		for (Integer ma :dsMa)
			System.out.print(ma+" ");
		System.out.println();
		
		String ten1=map.get(7);
		System.out.println(ten1);
		
		if (map.containsKey(8)==false)
			map.put(8, "!");
		for (String ten2 : ds)
			System.out.print(ten2+" ");
		System.out.println();
		
		map.remove(3);
		for (String ten2 : ds)
			System.out.print(ten2+" ");
		System.out.println();
		
		map.clear();
		System.out.println("Số phần tử còn lại là: "+map.size());
	}

}
