import jdk.nashorn.internal.ir.CatchNode;


public class FindNonRepetitiveFirstChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "teeter";
		try{
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)){
					//System.out.println("--"+s.charAt(i));
					
				}
				
			
		}
		}
		}
	catch(Exception e){
		//nothing
	}
	
}}

class A{
	public void XX() throws  RuntimeException {
		
	}
	
}
class B extends A{
	@Override
	public void XX() throws NullPointerException{
		// TODO Auto-generated method stub
		//super.XX();
	}
}
