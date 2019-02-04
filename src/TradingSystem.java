
public class TradingSystem {
	private static String category = "electronic trading system";

    public static void main(String[] args) {
        TradingSystem system = new DirectMarketAccess();
        DirectMarketAccess dma = new DirectMarketAccess();
        system=null;
        System.out.println(system.category);
        
        // static method of Instrument class will be called,
        // even though object is of sub-class DirectMarketAccess
        system.printCategory();
        
        //static method of EquityInstrument class will be called
        system.printCategory();
    }
  
    public static void printCategory(){
        System.out.println("inside super class static method");
    }
}
  
class DirectMarketAccess extends TradingSystem{
	
	public static void printCategory() {
		// TODO Auto-generated method stub

	}
   
}

 interface Interface1 {
	void method1(String str);	
	default void log(String str){
		System.out.println("I1 logging::"+str);}}


