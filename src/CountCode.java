
public class CountCode {
	
	public int countCode(String str) {
		  int counter=0;
		//while(){
		//for(int i=0; i<str.length(); i++){
		int index1=str.indexOf("co");
		int index2=str.indexOf("e");
		int index3=str.indexOf("co", index1);
		int index4=str.indexOf("e");
		
		if(index2>index1 && (index2-index1)==3)
		counter++;
		
		//if(index3>0){
			if(index4>index3 && (index4-index3)==3)
				counter++;
					
			//	}
		//break;
		//}
		//}
		  
		  return counter;
		  
		  
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountCode countCode= new CountCode();
		System.out.println(countCode.countCode("codexxcode"));
		

	}

}
