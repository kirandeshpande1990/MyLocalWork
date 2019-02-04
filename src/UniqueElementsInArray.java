import java.util.ArrayList;

public class UniqueElementsInArray {
	public void mymethods() {
		System.out.println("here");
	}

	public static void main(String[] args) throws Exception {
		Integer arr1[] = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Integer arr2[] = new Integer[] { 11, 12, 13, 4, 5, 6, 7, 18, 19 };
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();

		for (int i = 0; i < arr1.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					duplicate = true;
					al.add(arr1[i]);
					break;
				}
			}
			if (!duplicate) {
				al2.add(arr1[i]);
			}

		}
		System.out.println(al);
		System.out.println(al2);

	}

}

class myclass extends UniqueElementsInArray {

	public static void main(String[] args) {
		UniqueElementsInArray inArray = new myclass();
		inArray.mymethods();
		myclass myclass = new myclass();
		myclass.mymethods();

	}

}
