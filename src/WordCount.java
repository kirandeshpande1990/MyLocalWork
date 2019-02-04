import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCount {

	public static Map<String, Integer> wordCount(String[] strings) {
		int counter = 1;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < strings.length; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				if (strings[i].equals(strings[j])) {
					counter++;
				}
			}
			if (!hm.containsKey((strings)[i])) {
				hm.put(strings[i], counter);
			}
			// System.out.println(strings[i]+"-----"+counter);
			counter = 1;
		}

		return hm;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "a", "b", "a", "c", "b", "a", "a", "b", "c", "b", "c",
				"d" };

		System.out.println(wordCount(arr));

	}

}
