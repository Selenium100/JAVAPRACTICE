package nityapractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StudentDatabase {

	public static void main(String[] args) {

		Student s1 = new Student("Nitya", 110, "computerScience", "A");
		Student s2 = new Student("Abhay", 120, "physics", "B");
		Student s3 = new Student("Zenet", 130, "chemistry", "C");
		Student s4 = new Student("Sujit", 140, "math", "D");

		Map<Integer, Student> hm = new HashMap<Integer, Student>();
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);
		hm.put(4, s4);

		Map<Integer, Student> sorted = hm.entrySet().stream()
				.sorted((a, b) -> a.getValue().getSname().compareTo(b.getValue().getSname()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(sorted);

	}

}
