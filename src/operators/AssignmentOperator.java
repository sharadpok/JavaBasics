package operators;

public class AssignmentOperator {

	public static void main(String[] args)
	{
		int a=10;  
		int b=20;  
		a+=4;//a=a+4 (a=10+4)  
		b-=4;//b=b-4 (b=20-4)  
		System.out.println(a);  
		System.out.println(b); 
		
		int a1,b1,c1,d1;
		a1=b1=c1=d1=20;
		a1+=b1-=c1*=d1/=2;
		System.out.println(a1+" "+b1+" "+c1+" "+d1);

	}

}
