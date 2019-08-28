package object;
class Student4
{
	int id;
	String name;
	public void insertRecord(int i,String n)
	{
		id=i;
		name=n;
	}
	public void displayRecord()
	{
		System.out.println("Id:"+id+" Name:"+name);
	}
}
public class ObjectInitializationThroughMethod {

	public static void main(String[] args)
	{
		Student4 s=new Student4();
		Student4 s1=new Student4();
		s.insertRecord(52461, "Sharad");
		s1.insertRecord(52460, "Sameer");
		s.displayRecord();
		s1.displayRecord();

	}

}
