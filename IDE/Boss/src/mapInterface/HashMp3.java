package mapInterface;

import java.util.*;
public class HashMp3 {

	public static void main(String[] args) {
		// HashMap
		HashMap<String, String> hm = new HashMap();
				hm.put("India", "NewDelhi");
				hm.put("Nepal","Katmandu");
				hm.put("Srilanka", "Colombo");
				hm.put("Pakisthan","Islamabad");
				hm.put("China", "Beijing");
				hm.put("Bangladesh", "Dhaka");
				hm.put("Bhutan","Thimpu");
				hm.put("Afganisthan","Kabul");
				
		System.out.println(hm);
//				hm.clear(); // removes all the entries
				
				// iterating the HashMap after converting it to the Set
				Set s = hm.entrySet();
				Iterator it = s.iterator();
				while(it.hasNext())
				{
//					System.out.println(it.next());					
					Map.Entry mp = (Map.Entry)it.next();
					System.out.println(mp.getKey()  + "--" + mp.getValue() );
				}

	}

}
