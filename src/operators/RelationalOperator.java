package operators;

public class RelationalOperator {

	public static void main(String[] args)
	{
		/*Relational Operators: <,<=,>,>= 
		We can apply this operators for all types of primitive data
		types except boolean. We cannot apply them on string, array.
		Output of these operators is always in booean type i.e.
		true or false. But input cannot be boolean.*/		
		
		System.out.println(10<20);  // True
		System.out.println(10<=10); // True
		System.out.println(10<=11); // True
		System.out.println(10>=10.00);// True
		System.out.println('a'<10); // false
		System.out.println('a'<97.6);// True
		System.out.println('a'<'A'); // False
		//System.out.println(true<false);  invalid operator for type boolean
		System.out.println(98.00f>=98.00); //true
		System.out.println(98.56f<=98.5600); //true

	}

}
