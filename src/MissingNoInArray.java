import java.util.List;


public class MissingNoInArray {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int arr[] = new int[]{1,2,3,4,6,7,8,9};
		try{
		for (int i = 0; i < arr.length; i++) {
			if((arr[i+1]!=(arr[i]+1))){
				System.out.println(arr[i]);
			}
		}
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
