package finalKeyword;
/*If any static final variable is blank then we call it as a static
blank variable and we can only assign value to it from the static 
block only.*/
class Bike9
{
public static final int speedLimit;	
static
{
speedLimit=70;	
}
}
public class InitializingSaticBlankVariable
{
public static void main(String[] args)
	{
		System.out.println(Bike9.speedLimit);

	}

}
