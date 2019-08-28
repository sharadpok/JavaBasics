package operators;

public class ArithmeticOperators
{

	public static void main(String[] args)
	{
		int a=10;
		int b=5;
		
		System.out.println(a+b);   //15
		System.out.println(a-b);   //5
		System.out.println(a*b);   //50
		System.out.println(a/b);   //2
		System.out.println(a%b);  // 0
        System.out.println("Combinations of Arithmetic operators");
		System.out.println(10*10/5+3-1*4/2);  // 21. div -->mul-->add-->sub
		
		// Rule: byte-->short-->int-->long-->float-->double
		// case:1 byte+byte=int
		byte b1=10,b2=20;
		int res=b1+b2;
		System.out.println("Byte+Byte=Int Result: "+res);//30
		
		//case:2 byte+short=int
		short s=20;
		int res1=b1+s;
		System.out.println("Byte+Short=Int Result:"+res1);//30
		
		// case:3 Short+Short=Int
		short s1=10;
		int res2=s+s1;
		System.out.println("Short+Short=Int Result:"+res2);//30
		
		//case:4 byte+Long=Long
		long l=10;
		long res3=b1+l;
		System.out.println("byte+Long=Long Result:"+res3);//20
		
		//case:5 long+long=Long
		long l1=10;
		long res4=l+l1;
		System.out.println("long+long=Long Result"+res4);//20
		
		//case :6 long+Double=Double
		double d=10;
		double res5=l+d;
		System.out.println("long+Double=Double Result: "+res5);//20.0
		
		//case:6 Float+Long=Float
		float f=10.5f;
		float res6=f+l;
		System.out.println("Float+Long=Float Result:"+res6);//20.5
		
		// case:7 Float+Double=Double
		double res7=f+d;
		System.out.println("Float+Double=Double Result:"+res7);//20.5
		
		//case:8 Char+Char=Int
        char ch='a',ch1='b';
        int res8=ch+ch1;
        System.out.println("Char+Char=Int Result:"+res8);// 97+98=195
        
        //case:9 Char+Double=Double
        Double res9=ch+d;
        System.out.println("Char+Double=Double Result:"+res9); //97+10=107.0
	}

}
