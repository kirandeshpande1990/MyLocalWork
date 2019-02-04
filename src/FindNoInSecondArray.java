
public class FindNoInSecondArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrA[] = new int[]{1,2,3,4,5};
		int arrB[] = new int[]{2,3,1,0,5};
		try {
			for (int i = 0; i < arrA.length; i++) {
				for (int j = 0; j < arrB.length; j++) {
					if(arrA[i]==arrB[j]){
						System.out.println(arrB[i]);
					}
					
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
