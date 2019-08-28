package operators;

public class ArithmeticException {

	public static void main(String[] args)
	{
		/*In Integral arithmetic(byte, short, int, long)do not have
		provision to represent the infinity result, hence if such
		result comes then, runtime error occurs saying divide by zero
		exception.*/
		System.out.println(10/0);  //RE: Divide by zero
		
		/*But in floating point arithmetic(float, double) infinity 
		result can be represented as "INFINITY" and"-INFINITY"*/
        System.out.println(10/0.0);// INFINITY
        System.out.println(10.0/-0.0); //-INFINITY
        
        /*Undefined Result cannot be represented in the integral
        arithmetic but can be represented in floating point arithmetic.*/
        System.out.println(0/0);    //RE: Divide By Zero
        System.out.println(0.0/0);  // NaN
        System.out.println(0/-0.0); // -NaN
	}
	

}
