
public class RecursiveCall {
	 public static int fun(int n){
		 System.out.println("hello");
		 return n<3?1:fun(n-1)+fun(n-2);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(3));

	}

}
