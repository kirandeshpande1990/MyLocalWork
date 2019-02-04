public class CanBalanceArray {
	public boolean canBalance(int[] nums) {
		// System.out.println(nums.length);
		int add = 0;
		int add2 = 0;
		int add3 = 0; 
		int add4 = 0;
		Boolean isValid = false;
		int arrLength = nums.length;
		if (arrLength % 2 == 0) {
			for (int i = 0; i < arrLength / 2; i++) {
				add3 += nums[i];
			}
			for (int i = arrLength / 2; i < arrLength; i++) {
				add4 += nums[i];
			}
			if (add3 == add4) {
				isValid = true;
			}

		} else {

			for (int i = 0; i < arrLength / 2 + 1; i++) {
				add += nums[i];
			}
			for (int i = arrLength / 2; i < arrLength; i++) {
				add2 += nums[i];
			}
			if (add == add2)
				isValid = true;
		}
		return isValid;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[] {0, 2, 2, 1, 10, 2, 1, 2, 0 };
		int arr2[] = new int[] { 20, 10, 10, 20 };
		CanBalanceArray array = new CanBalanceArray();
		// array.canBalance(arr1);
		System.out.println(array.canBalance(arr1));
	}

}
