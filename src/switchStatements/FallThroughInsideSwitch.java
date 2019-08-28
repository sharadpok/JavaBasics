package switchStatements;

public class FallThroughInsideSwitch {

	public static void main(String[] args)
	{
		/*Within the switch case if any case is marched from that case onward all 
		statements will be executed until break orr end of the switch.all this 
		is called fall through inside the switch.*/
		
		String month="May";
		switch(month)
		{
		case "jan":
		case "Feb":
		case "March":System.out.println("Quarter-1");
		break;
		
		case "April":
		case "May": 
		case "Jun": System.out.println("Quarter-2");
		break;
		case "July": 
		case "Aug": 
		case "Sep": System.out.println("Quarter-3");
		break;
		
		case "Oct": 
		case "Nov": 
		case "Dec": System.out.println("Quarter-4");
		break;
		
		}

	}

}
