package polymorphismMethodOverloading;

public class TypePromotionCase3
{
public void m1(String s)
{
System.out.println("String version");	
}
public void m1(StringBuffer s)
{
System.out.println("StringBuffer version");	
}

	public static void main(String[] args)
	{
		TypePromotionCase3 ref=new TypePromotionCase3();
		ref.m1(new String()); // String Version
		ref.m1(new StringBuffer());// StringBuffer
		//ref.m1(null);
		/*Ambiguous because String and StringBuffer both classes are
		at the same level hence compiler ges confused to whome call*/
		

	}

}
