package communityuni.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestIterator {

	public static void main(String[] args) {
		Set<String> list = new HashSet<String>();

		list.add("A");
		list.add("B");
		list.add("D");
		list.add("C");
		list.add("E");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			if (s.equals("B")) {
				itr.remove();
			}
		}
		for (String i : list)
			System.out.println(i);
	}

}
