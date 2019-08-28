package polymorphismMethodOverriding;
class Synchro
{
public synchronized void m1()
{
System.out.println("synchro method");	
}
}
class NonSynchro extends Synchro
{
public void m1()
{
	System.out.println("Non Synchro");
}
}
public class SynchronisedMethod
{

	public static void main(String[] args)
	{
		NonSynchro ns=new NonSynchro();
		ns.m1();  // nonsynchro
		
		Synchro sn=new Synchro();
		sn.m1();  // Synchro
		
		Synchro sn1=new NonSynchro();
		sn1.m1();   //NonSynchro

	}

}
