package stringexamples;

public class StringSwapWithoutThirdVariable {

	public static void main(String[] args)
	{
        /*int a=10;
        int b=20;
        System.out.println("Values before swap a:"+a+" b: "+b);
        a=a+b;
        b=a-b;
        a= a-b;    
        System.out.println("Values After swap a:"+a+" b: "+b);*/
        
        String s1="Hi";
        String s2="Bye";
        System.out.println("Before Swap: "+s1+" "+s2);
        s1=s1+s2;  //HiBye
        s2=s1.substring(0,s1.length()-s2.length());  // Hi
        s1=s1.substring(s2.length()); //Bye
        
        System.out.println("After swap: "+s1+" "+s2);
        
        
        
        
	}

}
