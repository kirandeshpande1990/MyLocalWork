interface Java8Test{  
void draw();  
String abc=null;
default void msg(){System.out.println("default method");}  
}  
class Rectangle implements Java8Test{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class TestInterfaceDefault{  
public static Java8Test x;
public static void main(String args[]){  
	Java8Test d=new Rectangle();  
	//x.abc="abc";
System.out.println();	
d.draw();  
d.msg();  
}}