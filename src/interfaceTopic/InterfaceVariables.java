package interfaceTopic;
interface Interface1
{
double PI=3.14;	
}
public class InterfaceVariables implements Interface1
{

	public static void main(String[] args) {
		//PI=PI+10;  As it is final we cannot change the value
		System.out.println(PI);

	}

}
