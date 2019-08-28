package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AddingObjectsToTheArrayList
{

	public static void main(String[] args)
	{
		//Hence we can add objects also to the ArrayList.
		Employee e=new Employee("sharad",26,"GG1");
		Employee e1=new Employee("Jotiba",30,"GG2");
		Employee e2=new Employee("Sunil",40,"GG3");
		ArrayList<Employee> ar=new ArrayList<Employee>();
		ar.add(e);
		ar.add(e1);
		ar.add(e2);
		for(Employee obj:ar)
		{
			System.out.print(obj.name+" ");
			System.out.print(obj.age+" ");
			System.out.print(obj.grade+" ");
			System.out.println();
		}
		System.out.println("Using Itrator");
		// Even we can use Iterator also
		Iterator<Employee> itr=ar.iterator();
		while(itr.hasNext())
		{
			Employee emp=itr.next();
			System.out.print(emp.name+" ");
			System.out.print(emp.age+" ");
			System.out.print(emp.grade+" ");
			System.out.println();
		}
		
		
		

	}

}
