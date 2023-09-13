package mapping;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
//    <k,v>
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(100, "Tom");
		map.put(200, "Peter");
		map.put(300, "Naveen");
		map.put(400, "Ravi");
		System.out.println(map.get(100));
		
		
//		Map<String,String> empData=new HashMap<String,String>();
//		Map<String,String> empData=new LinkedHashMap<String,String>();
		Map<String,String> empData=new TreeMap<String,String>();
		empData.put("Amazon", "Tom");
		empData.put("MS", "Peter");
		empData.put("Google", "Naveen");
		empData.put("Sapiens", "Ravi");
		System.out.println(empData.get("Amazon"));
		empData.forEach((k,v)->System.out.println(k +":"+ v));
		
	}

}
