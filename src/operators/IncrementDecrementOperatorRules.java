package operators;

public class IncrementDecrementOperatorRules {

	public static void main(String[] args) {
		
		//1. It cannot be applied on the constant values, but only on variables  
       int a=10;
       int y=++a;
       //int z=++10; --Invalid argument for operator
       System.out.println("Using genral method: "+y);
       
       //3.Nesting of the increment and decrement operator is not allowed
      
       // int y1=++(++a); -CE: Invalid argument
       
       //4.It cannot be applied on the final values
       final int z=10;
       //int output=z++; --CE: Cannot change the value of final
       
       //5. We can apply incre and dec operators on the every premitive data types except boolean.
       int x1=10;
       System.out.println("Applied on int: "+(x1++));
       char ch='a';
       System.out.println("Applied on char: "+(ch++));
       double dob=10.5;
       System.out.println("Applied on double: "+(dob++));
      // boolean flag=true;
      // System.out.println("Applied on boolean: "+(flag++));--CE: We cannot apply it on the boolean type.
       
       //1. Arithmetic operator
       byte a1=10;
       byte b=20;
      // byte c=a1+b; --CE: Cannot convert from int to byte
       byte c=(byte)(a1+b);// Explicit type casting
       System.out.println("Result after explicit type casting: "+c);
       
       //2. 
       byte d=10;
       //byte res=d+1;-- CE: cannot convert from int to byte
       byte res=(byte)(d+1);
       System.out.println("Res after explicit type casting: "+res);
       
       //3. But in case of increment and decrement operators, internal type casting is done automatically.
       byte num=10;
       byte ans=num++;   // byte ans=(byte)+(num+1)-- Hence we do not get any error
       byte ans1=++num;
       byte ans2=num--;
       byte ans3=--num;
       System.out.println("Results after internal type casting: "+ans+" "+ans1+" "+" "+ans2+" "+ans3);
	}

}
