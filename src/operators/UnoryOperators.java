package operators;

public class UnoryOperators
{

	public static void main(String[] args)
	{
		//1. pre-increment: increment first and then assign
		System.out.println("Pre-Increment");
		int a=10;
		System.out.println(++a);  //11
		System.out.println(++a +  ++a);  // 12+13=25
		System.out.println(++a  - a);    // 26-26=0
		
		//2. post-increment: first assign and then increment
		System.out.println("Post-increment");
		int b=10;
		System.out.println(b++);  //10(11)
		System.out.println(b);    // 11
		System.out.println(b++  +  b++);  // 11+12=23
		System.out.println(b);
		System.out.println(b++ - b++ + b++); // 13-14+15=14
		
		//3. pre-decrement: decrement by one and then assign
		int c=10;
		System.out.println("Pre-decrement");
		System.out.println(--c); //9
		System.out.println(--c  + --c);  // 8+7=15
		System.out.println(--c - --c);  // 6-5=1
		
		// 4. post-decrement 
		int d=10;
		System.out.println("Post-decrement");
		System.out.println(d--); //10(9)
		System.out.println(d);
		System.out.println(d--  + d--); //9+8=17(7)
		System.out.println(d);   // 7
		
		//5. Combination of the the above expression
		int e=10;
		System.out.println("Combination of all expressions");
		System.out.println(e++ + --e + e-- - ++e); //10+10+10-10=20
		System.out.println(e);
		System.out.println(e++ - ++e + e-- + e++);//10-12+12+11=21
		
		//6.Negation operator for integral
		System.out.println(~10);     // prob
		System.out.println(~(-5)); //   prob
		
		//7.Negation operator for boolean
		System.out.println(!true);
		System.out.println(!false);
		

	}

}
