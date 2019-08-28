package array;

public class JTClassNameOfArray {

	public static void main(String[] args)
	{
		/*We can get the class name of the java array by using the
		getClass() and getName() methods.*/
		
		int[] array= {10,20,30};
		Class c=array.getClass();
		String name=c.getName();
		System.out.println("Class Name:"+name);

	}

}
