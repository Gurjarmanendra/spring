package test;

import java.util.StringTokenizer;

class A
{
void show()
{
	System.out.println("Show A");
}
void set()
{
	System.out.println("Set A");
	}
}
public class B extends A{
void show()
{
	System.out.println("Show B");
	}
void call()
{
System.out.println("call B");	
}

	public static void main(String[] args) {
		
		  String msg = "http://www.fdg.com";
	        StringTokenizer st = new StringTokenizer(msg,"://.");
	        while(st.hasMoreTokens()){
	            System.out.println(st.nextToken());}
		/*A a=new B();
		a.show();
		a.set();
         //a.call();
          */		
	}

}

 class MyStringToNumber {
	 
    public static int convert_String_To_Number(String numStr){
         
        char ch[] = numStr.toCharArray();
        int sum = 0;
        //get ascii value for zero
        int zeroAscii = (int)'0';
        for(char c:ch){
            int tmpAscii = (int)c;
            System.out.println("tmpAscii"+tmpAscii);
            System.out.println("zeroAscii"+zeroAscii);
            sum = (sum*10)+(tmpAscii-zeroAscii);
        }
        return sum;
    }
     
    public static void main(String a[]){
        System.out.println("\"3256\" == "+convert_String_To_Number("3256"));
    }
}
