
 class TwoArrayAddition {
	float d  = (float) (0*1.0);
	int x;
	public void	 stringCheck() {
		String s = "xyz";
		String s1 = new String("xyz");
		String s3="xyz";
		System.out.println(s==s1);
		//System.out.println("Result:"+ 2+3+5);
		//System.out.println(7+9+"Kiran");
		System.out.println(s==s3);
	}

	public static void main(String[] args) {
		int x= 12;
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {10,9,8,7,6,5};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if((arr1[i]+arr2[j])==x)
				{
					System.out.print("("+arr1[i]+","+arr2[j]+")");
				}
				
			}
			
		}
TwoArrayAddition addition = new TwoArrayAddition();	addition.stringCheck();
	}

}
