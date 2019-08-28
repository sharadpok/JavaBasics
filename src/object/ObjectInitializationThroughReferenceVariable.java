package object;
class Student2
{
	int id;
	String name;
}
public class ObjectInitializationThroughReferenceVariable {

	public static void main(String[] args)
	{
		Student2 s=new Student2();
		s.id=52461;
		s.name="Sharad";
		System.out.println(s.id);
		System.out.println(s.name);

	}

}
