/**
* Singleton pattern example with Double checked Locking
*/
public class DoubleCheckedLockingSingleton{
     private volatile static DoubleCheckedLockingSingleton INSTANCE;
  
     private DoubleCheckedLockingSingleton(){}
  
     public static DoubleCheckedLockingSingleton getInstance(){
         if(INSTANCE == null){
            synchronized(DoubleCheckedLockingSingleton.class){
                //double checking Singleton instance
                if(INSTANCE == null){
                    INSTANCE = new DoubleCheckedLockingSingleton();
                }
            }
         }
         return INSTANCE;
     }
     
     @Override 
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString(); 
    }
}
